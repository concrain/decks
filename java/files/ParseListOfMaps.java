import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class ParseListOfMaps {
    public static String query = "[{batch_clinic:ehealthscreenings},{batch_clinic:quest},{batch_clinic:summit}]";
    public static List<String> listOfClinics = new ArrayList<String>();
    public static String equalsCheck =null;
    
    public static List<String> parseList(String cl) {
        String[] pieces = cl.split(",");   
        for (String c : pieces) {
          c = c.replaceAll("\\[|\\]", "");
          c = c.replaceAll("\\{|\\}", "");
          c = c.replaceAll("\"", "");
          String[] clinics = c.split(":");
          String currentClinic = clinics[1];
          addNewClinicToList(currentClinic);
        }
        return listOfClinics;
    }
    
    public static void addNewClinicToList(String clinic) {
        if(!clinic.equals(equalsCheck)) {
          listOfClinics.add(clinic);
          equalsCheck = clinic;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(parseList(query));
    }
}
