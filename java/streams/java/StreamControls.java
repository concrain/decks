import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class StreamControls
{
    private static int[] numbers = new int[]{1, 2 ,3 ,4 ,5};
    private static double[] dNumbers = new double[]{1.1, 2.2, 3.3, 4.4, 5.5};
    
    public static void saveStream() {
        try {
            FileOutputStream fos = new FileOutputStream("Data.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            
            for(int i=0; i<numbers.length; i++) {
                dos.writeInt(numbers[i]);
                dos.writeDouble(dNumbers[i]);
            }
            dos.close();
        } catch(IOException e) {
            System.out.println("Save Steam failed: " + e);
        }
    }
    
    public static void loadStream() {
        ArrayList<Integer> loadInt = new ArrayList<Integer>();
        ArrayList<Double> loadDouble = new ArrayList<Double>();
        
        try {
            FileInputStream fis = new FileInputStream("Data.txt");
            DataInputStream dis = new DataInputStream(fis);
            
            int inputLength = fis.available();
            System.out.printf("Length of the input stream: %d\n", inputLength);
            int content;
            while (inputLength != -1) {
                loadInt.add(dis.readInt());
                loadDouble.add(dis.readDouble());
            }
            dis.close();
            System.out.println("Integers from stream: " + loadInt);
            System.out.println("Doubles from stream: " + loadDouble);
        } catch(IOException e) {
            System.out.println("Load Steam failed: " + e);
        }
    }
    
    public static void main() {
        saveStream();
        loadStream();
    }
}
