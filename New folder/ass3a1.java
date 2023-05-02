import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class a1{

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql:mydb1","postgres","postgres");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from project");
			while(rs.next()) {
				System.out.println("projectid= "+rs.getInt(1)+"\t project Name= "+rs.getString(2)+"\t project description= "+rs.getString(3)+"\t project status= "+rs.getString(4));
				
			}
		}
			catch(Exception e){
				System.out.println("Error"+e);
			}
			
		
	}

}
