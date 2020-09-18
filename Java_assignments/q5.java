package q1;
import java.util.Scanner;

public class q5 {

/*
 05.	Write a program that takes user’s name as command line argument and prints Welcome
  <entered user name>.
 */
	public static void main(String[] args) {
		
		System.out.println("Enter Name:");
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Welcome "+name );
	}

}
