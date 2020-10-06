/*
17.	Write a program to reverse a given number.

*/

import java.util.Scanner;

class q17{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int num,rem;
int rev=0;
System.out.println("Enter Number: ");
num=sc.nextInt();

while(num!=0){
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.println("Reverse : "+rev);
}




}