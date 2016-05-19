import java.util.ArrayList;

public class Split {
    
    public static String[] myList = {"a", "b","-","c","d","-","e","f","-"};
    
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
       
      /*
      ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
      data.add(new ArrayList<String>());
      int index =0;
      int innerIndex =0;
      for (int i =0; i<list.length; i++) {
          data.get(index).add(innerIndex, list[i]);
          innerIndex++;
      }
      
      System.out.println(data);
      */  
        return data;
    }
    public static void main(String[] args) {
        System.out.println("outer: "+ splitList(myList));
    }
}


/**
 *  
func fact(n int) int {
    if n == 0 {
        return 1
    }
    return n * fact(n-1)
}
 */
