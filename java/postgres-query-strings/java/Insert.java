import java.util.ArrayList;

public class Insert
{
    private static String tableName = "LOGGER";
    private static String[] columnName = {"first_name"};
    private static String[] columnValue = {"M"};
    
	public static String buildInsertStatement(String tableName, String[] columnName, String[] columnValue) {

		String str = "INSERT INTO humana." +tableName+ " ( ";

		for(int sigNum=2; sigNum>0; sigNum--) {
			ArrayList<String> params = new ArrayList<String>();
			if(sigNum == 2) { for(String c : columnName) { params.add(c); }}
			if(sigNum == 1) { for(String v : columnValue) { params.add(v); }}

			for (int i=0; i<params.size(); i++) {
				if (sigNum == 1) { str += "'"; }
				str += params.get(i);
				if (sigNum == 2) {
					if (i != params.size() -1) { str += ", "; }
					if (i == params.size() -1) { str += " "; }
				}
				if (sigNum == 1) {
					str += "'";
					if (i != params.size() -1) { str += ", "; }
					if (i == params.size() -1) { str += " "; }
				}
			}
			if(sigNum == 2) { str += ") VALUES ( "; }
			if(sigNum == 1) { str += ")"; }
		}
		System.out.println("db-insert-string: " + str);
		return str;
	}
	
	private static void main(String[] args) {
	   buildInsertStatement(tableName, columnName, columnValue);
	}
}
