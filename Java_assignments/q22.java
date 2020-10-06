/*
22.	Sort a ten element array in descending order.
*/
import java.util.Scanner;
class q22{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int n,temp;

System.out.println("Enter number of elements: ");
n= sc.nextInt();

System.out.println("Enter "+ n + " Elements:");
int ar[] = new int [n]; 

for(int i=0;i<ar.length;i++){
ar[i]=sc.nextInt();
}

for(int i=0;i<ar.length;i++){

for(int j=i+1;j<ar.length;j++){

if(ar[i]<ar[j]){
temp=ar[i];
ar[i]=ar[j];
ar[j]=temp;
}
}

}

System.out.println("Sorted elements are: ");
for(int r : ar){
System.out.print(r + "  ");
}

}



}