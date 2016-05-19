import java.io.File;
import java.io.FilenameFilter;
import java.io.FileInputStream;

public class GetFiles
{
  public static File[] getFilesFromDirectory(String path) {
    System.out.println("file path: "+  path);
    File directory = new File(path);
    File[] files = directory.listFiles(new FilenameFilter() {
        public boolean accept(File directory, String name) {
            return name.toLowerCase().endsWith(".csv") || name.toLowerCase().endsWith(".hl7");
        }
    });
    return files;
  }
  
  public static void main(String[] args) {
    String path = "//Users/russel/Desktop/BIOMETRICS-TESTING/complete/vitality/2016-05-10/summit/";
    File[] records = getFilesFromDirectory(path);
    for(File file : records) {
        System.out.println(file);
    }
  }
}
