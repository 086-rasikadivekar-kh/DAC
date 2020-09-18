package q1;

public class q4 {
/*04.
 * 	Write a program that initializes 2 byte type of variables. Add the values 
	of these variables and store in a byte type of variable. [Note: primitive down casting 
	 is required in this program ] .
	
*/
	public static void main(String[] args) {
		byte a=10;
		byte b=20;
		byte c=(byte) (a+b);                     //downcasting from int to byte
		System.out.println("Value of C = "+c);

	}

}
