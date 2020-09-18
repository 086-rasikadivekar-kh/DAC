/*
 07.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
	 Take the obtained marks from user using Scanner class. Output should be in this format 
	 [ percentage marks = 99 % ]. Use concatenation operator here.
*/

import java.util.Scanner;
class Q7{

public static void main(String args[]){

Scanner sc = new  Scanner(System.in);
System.out.println("Enter 5 subjects marks: ");
int sum=0;
for(int i=0;i<5;i++)
{

int m=sc.nextInt();
sum=sum+m;

}
System.out.println("Sum is: "+sum);
float per=(sum*100)/500;
System.out.println("Percentage marks = " + per + "%");

}
}