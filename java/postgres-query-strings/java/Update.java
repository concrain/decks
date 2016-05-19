
public class Update
{
    private static String tableName = "LOGGER";
    private static String primaryKey;
    private static String primaryKeyValue;
    private static String[] columnName = {"first_name"};
    private static String[] columnValue = {"M"};
    
	public static String buildUpdateStatement(String tableName, String primaryKey, String primaryKeyValue, String[] columnName, String[] columnValue) {
		String str = "";
		str += "UPDATE humana." +tableName+ " SET ";

		for (int i=0; i<columnName.length; i++) {
			str += columnName[i];
			str += " = '"+columnValue[i]+"'";
			if (i != columnValue.length -1) {
				str += ", ";
			}
		}
		str += " WHERE " +primaryKey+" = '"+primaryKeyValue+"'";
		return str;
	}

	public static void main(String[] args) {
	   buildUpdateStatement(tableName, primaryKey, primaryKeyValue, columnName, columnValue);
	}
}
