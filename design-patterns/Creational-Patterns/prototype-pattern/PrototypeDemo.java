public class PrototypeDemo {
    
  private static int threads = 3;  
  // 3. Populate the "registry"
  public static void initializePrototypes() {
      
    PrototypesModule.setThreadCount(threads);
    PrototypesModule.addPrototype( new Quest()    );
    PrototypesModule.addPrototype( new Walkin()   );
    PrototypesModule.addPrototype( new Standard() );
  }
  
  public static void main( String[] args ) {
    initializePrototypes();
    Object[] objects = new Object[threads];
    int total = 0;

    // 6. Client does not use "new"
    for (int i=0; i < args.length; i++) {
      objects[total] = PrototypesModule.findAndClone( args[i] );
      if (objects[total] != null) total++;
    }
    for (int i=0; i < total; i++) {
      ((Command)objects[i]).execute();
    }
  }
}


/*
// TODO instantiate only the required classes dynamicaly     
public class PrototypeDemo {
   
  // 3. Populate the "registry"
  public static void initializePrototypes(int count) { 
  //public static void initializePrototypes(String object int count) throws ClassNotFoundException, NoSuchMethodException, InstantiationException { 
 
    try {
      Class clazz = Class.forName(object).getConstructor().newInstance();
      PrototypesModule.addPrototype( clazz ); 
      //PrototypesModule.addPrototype( Class.forName(object).getConstructor().newInstance() );
    } catch (Exception e) {} 

    PrototypesModule.setThreadCount(count);
    
    PrototypesModule.addPrototype( new Quest()    );
    PrototypesModule.addPrototype( new Walkin()   );
    PrototypesModule.addPrototype( new Standard() );
  }
  
  public static void main( String[] args ) {

    Object[] objects = new Object[args.length];
    int total = 0;

    // 6. find valid objects
    for (int i=0; i < args.length; i++) {
      //initializePrototypes(args.length);
      //initializePrototypes(pbjects[i].toString, args.length);
      
      //objects[total] = PrototypesModule.findAndClone( args[i] );
      
      try {
        initializePrototypes(args.length);
        objects[total] = PrototypesModule.findAndClone( args[i] );
      } catch (Exception e) {}

      if (objects[total] != null) total++;
      System.out.println("total valid objects found: "+ total +"\n");
    }
    // generate valid objects
    for (int i=0; i < total; i++) {
      ( (Command)objects[i] ).execute();
    }
  }
  
}
*/