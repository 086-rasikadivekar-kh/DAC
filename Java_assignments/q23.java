/*
23.	Write a program to reverse the array elements.
*/


import java.util.Scanner;
class q23{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter number of elements : ");
n=sc.nextInt();

int arr1[] = new int[n];
int arr2[] = new int[n]; 

System.out.println("Enter the elements : ");

for( int i=0;i<arr1.length;i++){
arr1[i]=sc.nextInt();
}

int k=0;

for(int j=arr1.length-1;j>=0;j--){
arr2[k]=arr1[j];
k++;
}

System.out.println("Reverse array is :");
for(int r : arr2){
System.out.print(r + " " );
}
}
}