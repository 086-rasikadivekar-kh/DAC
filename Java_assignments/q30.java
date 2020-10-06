package q1;
import java.util.*;
public class q30 {

	/*
	 30.	Create an integer type 2-D array of size [3X3]. Take the elements from the user 
	 and then calculate the sum of the elements present in the diagonal.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a[][]= new int [3][3];
		
		for (int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println("ENter num:"+j);
				a[i][j]=sc.nextInt();
			}
		}

		int sum=0;
		for (int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(i==j){
					sum=sum+a[i][j];
				}
			}
		}
		
		System.out.println("Sum is  : "+sum);
		sc.close();
	}

}
