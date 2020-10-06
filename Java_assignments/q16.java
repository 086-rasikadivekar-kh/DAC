/*
16.	Write a program to print table of any entered number using loop.

*/
import java.util.Scanner;

class q16{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int num;
int res[] = new int[10];
System.out.println("Enter Number:");
num=sc.nextInt();

int j=0;

for (int i=1;i<=10;i++){
res[j]=num*i;
j++;
}

for(int r : res){
System.out.println(r);
}


}


}

