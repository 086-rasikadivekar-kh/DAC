/*

09. 	Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.

*/

import java.util.Scanner;
class q9{

public static void main(String[] args){

int d,m,yr,days;
Scanner sc=new Scanner(System.in);

System.out.println("Enter No. of days:");
d=sc.nextInt();

yr=d/365;
m=(d-yr*365)/30;
days=d-(yr*365)-(m*30);

System.out.println("Year="+yr);
System.out.println("Month="+m);
System.out.println("day="+days);

System.out.println(d  +" days="+yr +" Year" + m + " months" + days + "days");



}
}