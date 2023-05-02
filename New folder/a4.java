import java.util.*;

public class a4{
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the number of students:");
		int n = in.nextInt();

		Hashtable<String,Integer> A1 = new Hashtable<String,Integer>();
		
		
		for (int i=1 ; i<=n ; i++) {
			System.out.println("enter the name of students:");
			String name = in.next();
			System.out.println("enter the mobile number of student:");
			 int no = in.nextInt();
			A1.put(name,no);
			
		}
		System.out.println("the list of students is:");

		System.out.println(A1);
		
		



	}
}