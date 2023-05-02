import java.io.*;
import java.sql.*;
import java.util.*;

class b1{
	public static void main (String args[]) throws SQLException,IOException{
		try {
			Class.forName("org.postgresql.Driver");
			Connection con= DriverManager.getConnection("jdbc:postgresql:mydb1","postgres","postgres");
			ResultSet rs;
			
			Scanner in = new Scanner (System.in);
			while(true) {
			System.out.println("**********MENU***********");
			System.out.println("1. Insert\n2. modify\n3. Delete\n4. search\n5. view All\n6. Exit\n");
			System.out.println("------------------------------------------\n");
			int ch=in.nextInt();
			switch(ch) {
			case 1: PreparedStatement pst=con.prepareStatement("insert into mobile values(?,?,?,?,?)");
			System.out.println("*****Mobile details*****\n");
			
			System.out.println("Enter Model no:");
			pst.setInt(1,in.nextInt());
			
			System.out.println("Enter Model name:");
			pst.setString(2,in.next());
			
			System.out.println("Enter Model color:");
			pst.setString(3,in.next());
			
			System.out.println("Enter batter capacity:");
			pst.setString(4,in.next());
			
			System.out.println("Enter price:");
			pst.setString(5,in.next());
			
			pst.executeUpdate();
			
			System.out.println("------------Record inserted successfully-----------");
			
			break;
			
			case 2:
				PreparedStatement pst2= con.prepareStatement("update mobile set m_color=? where m_no=?");
				System.out.println("enter color: ");
				pst2.setString(1, in.next());
				
				System.out.println("enter model no: ");
				pst2.setInt(2, in.nextInt());
				pst2.executeUpdate();
				break;
				
			case 3:
				PreparedStatement pst3= con.prepareStatement("delete from mobile where m_no=?");
				System.out.println("enter model no: ");
				pst3.setInt(1, in.nextInt());
				pst3.executeUpdate();
				break;
				
			case 4:
				PreparedStatement pst4= con.prepareStatement("select * from mobile where m_color=?");
				
				System.out.println("enter color: ");
				pst4.setString(1, in.next());
				rs=pst4.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getString(4)+"\n"+rs.getString(5)+"\n");
					}
				break; 
				
			case 5:
				PreparedStatement pst5= con.prepareStatement("select * from mobile");
				rs = pst5.executeQuery();
				while(rs.next()) {
				System.out.println(rs.getInt(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getString(4)+"\n"+rs.getString(5)+"\n");
				}
				break;
				
			case 6:
				System.exit(0);
				
			}
			}
			
			//con.close();
		
			}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
}