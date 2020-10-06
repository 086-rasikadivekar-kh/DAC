/*
20.	Print all prime numbers between two given numbers. [ break continue ]
*/


import java.util.Scanner;

class q20{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int n1,n2;

System.out.print("Enter 1st number: ");
n1=sc.nextInt();

System.out.print("Enter 2nd number: ");
n2=sc.nextInt();

System.out.println("Prime numbers bet " + n1+" and "+n2 + " are:");


while(n1<=n2){
int b=0;
for(int i=2;i<n1;i++){

if(n1%i==0){
b=1;
}
}
if(b==0){
System.out.println(n1);

}
n1++;
}

}




}