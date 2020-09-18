/*
08.Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class

*/
import java.util.Scanner;

class q8{

public static void main(String args[]){

float principle,roi,time,si;

Scanner sc =  new Scanner(System.in);
System.out.println("Enter Principle: ");
principle = sc.nextFloat();

System.out.println("Enter Rate of Interest: ");
roi = sc.nextFloat();

System.out.println("Enter Time: ");
time = sc.nextFloat();

si=(principle*roi*time)/100;
System.out.println("The simple interest is : "+si);

}


}