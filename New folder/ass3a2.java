import java.sql.*;
public class a2 {
	public static void main (String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql:mydb1","postgres","postgres");
		//	Statement stmt = con.createStatement();
			DatabaseMetaData dbmd = con.getMetaData();
			ResultSet rs = dbmd.getTables(null,null,null,new String[] {"TABLE"});
			
			while(rs.next()) {
				System.out.println(rs.getString("TABLE_NAME"));
				
			}
			con.close();
		}
			catch(Exception e){
				System.out.println("Error"+e);
			}
	}
}
