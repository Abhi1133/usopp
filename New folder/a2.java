import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class a2{
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the number of friends:");
		int n = in.nextInt();
		
		LinkedList<String>A1 = new LinkedList<String>();
		
		for (int i=0; i<n; i++) {
			System.out.println("enter the name of friends:");
			String name = in.next();
			A1.add(name);
		}
		
		System.out.println("name of friends are");

		Iterator<String> itr=A1.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
	}
}