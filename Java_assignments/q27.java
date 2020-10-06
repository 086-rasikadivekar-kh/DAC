package q1;
import java.util.*;
public class q27 {

/*
 27.Write a program to fine the smallest and greatest number present in the array of 
 integer type
 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Number of elements : ");
		n=sc.nextInt();
		
		int a[]= new int[n];
		System.out.println("Enter "+n+" Elements:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		
		for(int r : a){
			if( r >max){
				max=r;
			}
			if(r <min){
				min=r;
			}
		}
		System.out.println("Maximum element is: "+max);
		System.out.println("Minimum element is: "+min);

	}

}
