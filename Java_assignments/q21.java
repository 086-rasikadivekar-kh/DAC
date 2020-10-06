/*
21.	Program to show sum and average of 10 element array. Accept array elements from user. 

*/
import java.util.Scanner;
class q21{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter number of elements : ");
int n= sc.nextInt();
System.out.println("Enter "+ n + " Elements:");
int ar[] = new int [n]; 

for(int i=0;i<ar.length;i++){
ar[i]=sc.nextInt();
}
int sum=0;
double avg;
for(int r : ar){
sum=sum+r;
}

avg=sum/ar.length;
System.out.println("Sum is: "+sum);
System.out.println("Average is: "+avg);

}



}