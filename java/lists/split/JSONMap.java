import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Collections; 
import java.util.HashMap; 

import java.util.StringTokenizer; 


public class JSONMap
{

  public static String json = "    [ {  'batch_id' : 'ef5f0032-2782-4a4c-a708-f62f3c583e2b', 'batch_name' : 'VitalityeHealthScreenings', 'batch_format' : 'csv', 'batch_collection_date' : '2016-04-10', 'output_file_zip' : 'output.zip', 'message_id' : 'c6373db6-55d5-44d9-9dd6-FIRST', 'first_name' : 'BATMAN', 'last_name' : 'HARDIN', 'gender' : 'male', 'dob' : '1965-07-12', 'member_id' : 'HUVBS',  'insurance_id' : '596820', 'vendor_id' : 'V45', 'relation_code' : '1', 'custom_1' : 'HGH45', 'processed_date' : '2016-04-11',  'output_file_name' : 'VitalityTest-978654312', 'kickout_status' : 'false', 'kickout_reason' : '[]'} {  'batch_id' : 'ef5f0032-2782-4a4c-a708-f62f3c583e2b', 'batch_name' : 'VitalityeHealthScreenings', 'batch_format' : 'csv', 'batch_collection_date' : '2016-04-10', 'output_file_zip' : 'output.zip', 'message_id' : 'c6373db6-55d5-44d9-9dd6-SECOND', 'first_name' : 'ROBIN', 'last_name' : 'SOFTIN', 'gender' : 'male', 'dob' : '1975-08-13', 'member_id' : 'HUVBS',  'insurance_id' : '596820', 'vendor_id' : 'V45', 'relation_code' : '1', 'custom_1' : 'HGH45', 'processed_date' : '2016-04-11',  'output_file_name' : 'VitalityTest-978654312', 'kickout_status' : 'false', 'kickout_reason' : '[]' } ]";
  
  public static void splitToObject(String list) {
      List<String> splitter = new ArrayList<String>();
      StringTokenizer tokens = new StringTokenizer(list, "{}"); 

      while(tokens.hasMoreElements()) {
        String temp = tokens.nextToken();
        if(temp.length()>10) {
          splitter.add(temp);
        }
      }
      System.out.println("Array Size: "+ splitter.size());
      System.out.println("Split: "+ splitter.get(0));
      System.out.println("Split: "+ splitter.get(1));
      
      
      for(String sp : splitter) {
        //System.out.println(sp);
        String[] entity = new String[sp.length()];
        entity = sp.split(",");
        System.out.println("Entity object: " + entity[0]);
        for(String e : entity) {
            //System.out.println(e);
        }
        System.out.println("============");
    }
  }
  
   public static void splitTooObject(String list) {
      List<String> splitter = new ArrayList<String>();
      StringTokenizer tokens = new StringTokenizer(list, "{}"); 

      while(tokens.hasMoreElements()) {
        String temp = tokens.nextToken();
        if(temp.length()>10) {
          String[] entity = temp.split(",");
          System.out.println("entity: " + entity[0]);
        }
      }
  }
  
  public static void main(String[] args) {
      splitTooObject(json);
  }
}


