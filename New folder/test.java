import java.sql.*;

public class test {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql:mydb1","postgres","postgres");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println("Roll no= "+rs.getInt(1)+"\t Name= "+rs.getString(2));
				
			}
		}
			catch(Exception e){
				System.out.println("Error"+e);
			}
			
		
	}

}
