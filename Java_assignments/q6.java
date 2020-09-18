package q1;
import java.util.Scanner;
public class q6 {

/*
 06.	Write a program that takes radius of a circle as input. Read the entered radius 
 using Scanner class. Then calculate and print the area and circumference of the circle
 */

	public static void main(String[] args) {
		System.out.println("Enter Radius of Circle: ");
		Scanner sc = new Scanner(System.in);
		float radius=sc.nextFloat();
		//System.out.println(d);
		
		float circumference,area;
		circumference=(float)(2*3.14*radius);
		System.out.println("Circumference is "+circumference);

		area=(float)(3.14*radius*radius);
		System.out.println("Radius is :"+area);
	}

}
