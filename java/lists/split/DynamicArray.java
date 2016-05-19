import java.util.ArrayList;
import java.util.List;

public class DynamicArray<E> extends ArrayList<E> {
    
    public static ArrayList<String> createData(List<String> value) {
        ArrayList<String> arr = new ArrayList<String>();
        for(String v : value) {
            arr.add(v);
        }
        return arr;    
    }   
}
