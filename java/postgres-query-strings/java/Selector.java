
public class Selector
{
    private static String tableName;
    private static String[] columnName;
    private static String[] columnNameTest;
    private static String[] columnValue;

    public static String buildSelectStatement(String tableName, String[] columnName, String[] columnNameTest, String[] columnValue) {
    
        String str = "SELECT ";
        for(int i=0; i<columnName.length; i++) {
            str += columnName[i];
            if (i != columnName.length-1) { str += ", ";}
        }
        str += " FROM humana." + tableName;
        str += " WHERE ";
        for(int i=0; i<columnNameTest.length; i++) {
            str += columnNameTest[i] + " ILIKE '" + columnValue[i] + "%'";
            if (i != columnNameTest.length-1) { str += " AND ";}
        }
        System.out.println("");
        System.out.println("db-select-string: " + str);
        return str;
    }
    
    private static void main(String[] args) {
        buildSelectStatement(tableName, columnName, columnNameTest, columnValue);
    }
}
