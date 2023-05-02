import java.util.*;


public class a3{
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the number of colors:");
		int n = in.nextInt();

		Set<String> A1 = new TreeSet<String>();
		
		
		for (int i=1 ; i<=n ; i++) {
			System.out.println("enter the name of colors:");
			String name = in.next();
			A1.add(name);
			
		}
		System.out.println("the list of colors is:");

		System.out.println(A1);
		
		



	}
}