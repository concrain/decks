import java.util.ArrayList;
import java.util.List;


public class split2DArray {
    
  public static ArrayList<ArrayList<String>> myList = new ArrayList<ArrayList<String>>();
  
  public static ArrayList<ArrayList<String>> buildList() {
    ArrayList<String> temp1 = new ArrayList<String>();
    temp1.add("uuid");
    temp1.add("+");
    temp1.add("uuid_id");
    temp1.add("+");
    temp1.add("123456");
    temp1.add("+");
    myList.add(temp1);
      
    ArrayList<String> temp2 = new ArrayList<String>();
    temp2.add("patient");
    temp2.add("+");
    temp2.add("patient_id");
    temp2.add("first_name");
    temp2.add("last_name");
    temp2.add("+");
    temp2.add("123456");
    temp2.add("russel");
    temp2.add("arthur");
    temp2.add("+");
    myList.add(temp2); 
    return myList;
  }
  
  public static ArrayList<ArrayList<ArrayList<String>>> build3DArray(ArrayList<ArrayList<String>> list) {  
        
        ArrayList<ArrayList<ArrayList<String>>> data = new ArrayList<ArrayList<ArrayList<String>>>(); 
        data.add(new ArrayList<ArrayList<String>>());
        int row =0;
        int column =0;
        
        for (int c=0; c<list.size(); c++) {
           System.out.println("raw array -> " + c +": "+ list.get(c));
           List<String> indexValues = new ArrayList<String>();
           
           for (int i=0; i<list.get(c).size(); i++) {
               String value = list.get(c).get(i);
               if(!value.contains("+")) {
                   System.out.println(" -> " + value);
                   indexValues.add(value);
                } else {  
                   System.out.println("break: " + value);
                   try {  
                       data.get(row).add( DynamicArray.createData( indexValues ));
                       indexValues.clear();
                    } catch (Exception e) {
                        System.out.println(e);
                    }  
                  if (i != list.get(c).size()-1) {   // end of column 
                      System.out.println(" column "+ column +" COMPLETE: -> "+ data);
                      column++;
                    } else {    // end of row
                       System.out.println(" ROW "+ row +" complete: -> "+ data);
                       System.out.println("");
                    }
                }
            }
            System.out.println("");
            if (c != list.size()-1) {
              row++;
              column =0;
              data.add(new ArrayList<ArrayList<String>>());
             }
        }
        
        /* expected return value
         * [ [[uuid], [uuid_id], [123456]], [[patient], [patient_id, first_name, last_name], [123456, russel, arthur]] ]
         */
        
        return data;
  }

  public static void main(String[] args) {
       System.out.println("mocked input values: " +buildList());
       System.out.println("for every '+' split the current list");
       System.out.println("");
       System.out.println("final 3DArray :" +build3DArray(myList));
  }
}
