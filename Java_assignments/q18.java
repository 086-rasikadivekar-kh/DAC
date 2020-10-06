/*
18.	Program to check whether number is prime or not.
*/

import java.util.Scanner;

class q18{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int num;
System.out.println("Enetr number:");
num=sc.nextInt();

int j=2;
int b=0;

for(int i=2;i<num;i++){
if(num% i==0){
b=1;
}
}

if(b==0){
System.out.println(" prime");
}
else{
System.out.println(" not priime");
}
}
}