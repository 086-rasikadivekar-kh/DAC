package q1;
import java.util.*;
public class q28 {
/*
 28.	Initialize one String type of array and print the elements using for each loop.
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter number of elements : ");
		n=sc.nextInt();
		
		String a[]=new String[n];
		System.out.println("Enter "+ n +" string type elements: ");
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.next();
		}
		for( String s : a ){
			System.out.print(s +" ");
			
		}
	}

}
