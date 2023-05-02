import java.util.*;

public class a1{
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the number of cities:");
		int n = in.nextInt();

		ArrayList<String> A1 = new ArrayList<String>(20);
		
		
		for (int i=1 ; i<=n ; i++) {
			System.out.println("enter the name of cities:");
			String name = in.next();
			A1.add(name);
			
		}
		System.out.println("the list of cities is:");

		System.out.println(A1);
		
		System.out.println("After removing all the cities name:");
		
		
		//for (int i=1 ; i<=n ; i++) {
			A1.removeAll(A1);
		//}
		
		System.out.println(A1);



	}
}