/*

19.	Calculate  series : 12+22+32+42+.........+n2
*/

import java.util.Scanner;

class q19{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int num;
System.out.println("Enter number:");
num=sc.nextInt();

int sum=0;
for(int i=1;i<=num;i++){

sum=sum+((10*i)+2);
}

System.out.println("Sum of "+ num +" term is: "+sum);

}
}