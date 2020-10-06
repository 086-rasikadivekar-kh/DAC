/*
24.	Write a program to search an element in the array.
*/

import java.util.Scanner;
class q24{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter number of elements : ");
int n= sc.nextInt();
System.out.println("Enter "+ n + " Elements:");
int ar[] = new int [n]; 

for(int i=0;i<ar.length;i++){
ar[i]=sc.nextInt();
}

int f;
int b=0;
System.out.println("Enter element to be search : ");
f=sc.nextInt();

for(int r : ar){
if(f == r){
b=1;
}
}

if(b==1){
System.out.println("Found ");
}

else{
System.out.println("Not found");
}




}




}