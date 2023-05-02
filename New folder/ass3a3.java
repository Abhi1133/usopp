import java.sql.*;


public class a3{

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql:mydb1","postgres","postgres");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from donar");
			ResultSetMetaData rsmd = rs.getMetaData();
			int noOfColumns = rsmd.getColumnCount();
			System.out.println("Number of columns = "+noOfColumns);
			for(int i = 1; i<=noOfColumns; i++) {
				System.out.println("Columns no : "+i);
				System.out.println("Columns name : "+rsmd.getColumnName(i));
				System.out.println("Columns type : "+rsmd.getColumnTypeName(i));
				System.out.println("Columns display size : "+rsmd.getColumnDisplaySize(i));
			}
			
		}
			catch(Exception e){
				System.out.println("Error"+e);
			}
			
		
	}

}
