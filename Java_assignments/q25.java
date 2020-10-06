/*
25.	Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.
*/

import java.util.Scanner;
class q25{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter number of elements : ");
int n= sc.nextInt();
System.out.println("Enter "+ n + " Elements:");
int ar[] = new int [n]; 

for(int i=0;i<ar.length;i++){
ar[i]=sc.nextInt();
}

int even=0;
int odd=0;
for(int i=0;i<ar.length;i++){

if (ar[i]%2==0){
even=even+ar[i];
}
else{
odd=odd+ar[i];
}

}

System.out.println("Sum of  even elemets : "+ even);
System.out.println("Sum of  odd elemets : "+ odd);
}
}