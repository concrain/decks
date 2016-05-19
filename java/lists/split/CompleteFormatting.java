import java.util.ArrayList;
import java.util.List;

public class CompleteFormatting {
    
    public static String[] myList = { "uuid", "+", "uuid_id", "+", "123456", "+", "-", "patient", "+", "patient_id", "first_name", "last_name", "+", "123456", "russel", "arthur", "+","-" };
    //public static String[] myList = { "uuid", "+", "uuid_id", "+", "123456", "+", "-"};
    //public static String[] myList = { "patient", "+", "patient_id", "first_name", "last_name", "+", "123456", "russel", "arthur", "+","-" };
    
    public static ArrayList<ArrayList<String>> splitList(String[] list) {
        
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        data.add(new ArrayList<String>());
        int row =0;
        int column =0;
        for (int i=0; i<list.length; i++) {
            System.out.println("will add: " + list[i]);
            if(!list[i].contains("-")) {
                System.out.println("row: " + row +" column: "+ column);
                data.get(row).add(column, list[i]);
                column++;
            } else {
                row++;    // will move to next row
                column = 0;  // reset or you will be out of bounds
                System.out.println("row complete: " + data);
                System.out.println("");
                if (i != list.length-1) {
                    data.add(new ArrayList<String>());  // create an new row until your list is empty
                }
            }
       }
       return data;
    }
    
  public static ArrayList<ArrayList<ArrayList<String>>> convertSplit(ArrayList<ArrayList<String>> list) { 
        
        ArrayList<ArrayList<ArrayList<String>>> data = new ArrayList<ArrayList<ArrayList<String>>>();
        
        for (int c=0; c<list.size(); c++) {
           System.out.println("insert data raw array: " + list.get(c));
           ArrayList<ArrayList<String>> rowArr = new ArrayList<ArrayList<String>>();
           data.add(rowArr);
           ArrayList<String> columnArr = null;

            for (int i=0; i<list.get(c).size(); i++) {
               String insert = list.get(c).get(i);
               if(!list.get(c).get(i).contains("+")) {
                   System.out.println(" -> " + insert);
                   if(columnArr == null) {
                       columnArr = new ArrayList<String>();
                       rowArr.add(columnArr);
                   }
                 columnArr.add(insert);
               } else { 
                   System.out.println("");
                   System.out.println("found the break symbol");
                   columnArr = null;             
               }
           }
        }
        return data;
    }
  
  public static ArrayList<ArrayList<String>> toTables(ArrayList<ArrayList<ArrayList<String>>> list) {
      
    ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();  
    ArrayList<String> tables = new ArrayList<String>();
    ArrayList<String> columnNames = new ArrayList<String>();
    ArrayList<String> columnValues = new ArrayList<String>();
  
    for (int r=0; r<list.size(); r++) {

		for (int c=0; c<list.get(r).size(); c++) {
		    
		    for (int i=0; i<list.get(r).get(c).size(); i++) {
    		    String value = list.get(r).get(c).get(i);
    		    System.out.println("index: " + value);
    		        		
    		    System.out.println("row:  ["+r+"]["+c+"]["+i+"]");    		   
    		    if (c == 0) {
    		        tables.add(value);
    		     }
    		    if (c == 1) {
    		        columnNames.add(value);	      
    		     }
    		    if (c == 2) {
    		        columnValues.add(value);
    		     }
    		  }
         }
        System.out.println();
        System.out.println("row: " + list.get(r));
     }
     data.add(tables);
     data.add(columnNames);
     data.add(columnValues);
     return data;
}

    /* exptected return value
     * [ [[uuid], [uuid_id], [123456]], [[patient], [patient_id, first_name, last_name], [123456, russel, arthur]] ]
     */
  public static void main(String[] args) {
        System.out.println("final array: "+ toTables(convertSplit(splitList(myList))));
    }
}

