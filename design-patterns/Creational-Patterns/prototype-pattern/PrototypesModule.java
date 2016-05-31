

class PrototypesModule {
    
  private static int total = 0;
  private static int threads = 0;
  private static Prototype[] prototypes = null;
  
  public static void setThreadCount(int count){
    threads = count;
    System.out.println("threads: "+ threads);
    // 2. "registry" of prototypical objs
    prototypes = new Prototype[threads];
  }
  
  // Adds a feature to the Prototype attribute of the PrototypesModule class
  // obj  The feature to be added to the Prototype attribute
  public static void addPrototype( Prototype obj ) {
    prototypes[total++] = obj;
  }

  public static Object findAndClone( String name ) {
    // 4. The "virtual ctor"
    for ( int i = 0; i < total; i++ ) {
      if ( prototypes[i].getName().equals( name ) ) {
        System.out.println("\ncloning object: "+ prototypes[i].getName());
        return prototypes[i].clone();
      }
    }
    System.out.println("clinic "+ name +" not found");
    return null;
  }
  
}
