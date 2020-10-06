package q1;
/*
 29.	Write a program to print the total number of one-D arrays in a two-D array and 
 the number of elements in every one-D array present in the two-D arrays.
 */
public class q29 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {10,23,11};
		int c[] = {1,2,3,4,5,6,7};
		
		int arr[][] = new int[3][];
		arr[0] =a;
		arr[1]=b;
		arr[2]=c;
		
		int count1 = 0;
		for(int ar[] : arr) {
			count1++;
			int count2 = 0;
			for(int r: ar) {
				count2++;
				
			}
			System.out.println("number of elements in every one-D array :  "+count2);
		}
		System.out.println("total number of one-D arrays : "+count1);
		
	}

}
