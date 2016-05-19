
public class Join
{
    private static String[] tableName =    { "batch", "message", "patient", "system", "logger", "files", "kickout"};
    private static String[] primaryKey =   { "uuid", "message_id" };
    private static String[] foreignKey =   { "batch_id","patient_id", "system_id", "logger_id", "file_id", "kickout_id"};
    private static String[][] columnNames= { {"batch_id","batch_name","batch_format","batch_collection_date"},{"message_id"},{"first_name","last_name","gender","dob"},{"member_id","insurance_id","vendor_id","relation_code","custom_1"},{"processed_date"},{"output_file_name"},{"kickout_status","kickout_reason"} }; 
    private static String[] whereTable =   { "logger" };
    private static String[] whereColumn =  { "processed_date" };
    private static String[] whereValue =   { "2016-04-11" };
   
    public static String buildJoinStatement(String[] tableName, String[] primaryKey, String[] foreignKey, String[][] columnNames, String[] whereTable, String[] whereColumn, String[] whereValue) {
    /*
     * SELECT t1.col, t3.col 
     * FROM table1 
     * JOIN table2 ON table1.primarykey = table2.foreignkey
     * JOIN table3 ON table2.primarykey = table3.foreignkey
     * 
     * N-1 join statement in order to join N tables
     * 
         SELECT 
        humana.batch.batch_id, humana.batch.batch_name, humana.batch.batch_format, humana.batch.batch_collection_date, 
        humana.message.message_id,
        humana.patient.first_name, humana.patient.last_name, humana.patient.gender, humana.patient.dob, 
        humana.system.member_id, humana.system.insurance_id, humana.system.vendor_id, humana.system.relation_code, humana.system.custom_1, 
        humana.logger.processed_date,
        humana.files.output_file_name, 
        humana.kickout.kickout_status, humana.kickout.kickout_reason
        FROM humana.batch 
        INNER JOIN humana.message ON humana.batch.batch_id     = humana.message.uuid
        INNER JOIN humana.patient ON humana.patient.patient_id = humana.message.message_id
        INNER JOIN humana.system  ON humana.system.system_id   = humana.message.message_id
        INNER JOIN humana.logger  ON humana.logger.logger_id   = humana.message.message_id
        INNER JOIN humana.files   ON humana.files.file_id      = humana.message.message_id
        INNER JOIN humana.kickout ON humana.kickout.kickout_id = humana.message.message_id
        WHERE humana.logger.processed_date = '2016-04-11';

     */
     int numberOfJoins = tableName.length-1;
     System.out.println("number of joins: " + numberOfJoins);
     System.out.println("column Arrays: Should be (1) more than joins: " + columnNames.length);
     String str = "SELECT "; 

    for (int t=0; t<tableName.length; t++) {
        
        for (int c=0; c<columnNames[t].length; c++) {        
            str += "humana."+ tableName[t] +"."+ columnNames[t][c];
            if (c != columnNames[t].length -1 || t != columnNames.length -1) {
                str += ", ";
            }
        }
    }
    str += " FROM " + "humana."+ tableName[0];
    for(int j=0; j<numberOfJoins; j++) {
        int pk =0;
        if (j==0) { pk = 0;}
        else { pk = 1; }
        str += " INNER JOIN ";
        str += "humana." +tableName[j+1];
        str += " ON ";
        str += "humana." +tableName[j+pk] +"."+ foreignKey[j] +" = "+ "humana." +tableName[1] +"."+ primaryKey[pk];
    }
     
     str += " WHERE humana."+ whereTable[0] +"."+ whereColumn[0] +" ILIKE '"+ whereValue[0] + "%'"; 
     //System.out.println(str);
    
      return str;
    }
  
    public static void main(String[] args) {
      System.out.println(buildJoinStatement(tableName, primaryKey, foreignKey, columnNames, whereTable, whereColumn, whereValue));
    }
}
