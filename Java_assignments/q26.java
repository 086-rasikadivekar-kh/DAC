package q1;
import java.util.*;
public class q26 {
/*
 26.Create an array of 17 elements in 5 rows.  
 And calculate sum of all elements.
 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int col,row;
		int sum=0;
		System.out.println("Enter no. of rows and columns:  ");
		row=sc.nextInt();
		col=sc.nextInt();
		
		int ar[][] = new int[row][col];
		
		for(int i=0;i<ar.length;i++){
			
			for(int j=0;j<ar[i].length;j++){
				System.out.println("ENter elements: ");
				ar[i][j]=sc.nextInt();
			}
		}
		
		for(int r[] : ar){
			for(int s : r){
				
			//System.out.println(s);
				sum=sum+s;
			}
		}
		
		System.out.println("Sum is: "+sum);
		
		
		
		sc.close();

	}

}
