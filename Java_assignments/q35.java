import java.util.*;

class MathOperation{
	static int add(int n1, int n2){
		return (n1+n2);
	}

	static int substract(int n1, int n2){
		return (n1-n2);
	}

	static int multiply(int n1, int n2){
		return (n1*n2);
	}

	static double power(int n1, int n2){
		return Math.pow(n1,n2);
	}
}

class Q35{
	public static void main(String args []){
		int n1,n2;
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();

		MathOperation m1 = new MathOperation();
		System.out.println("Addition = "+m1.add(n1,n2));
		System.out.println("Substraction = "+m1.substract(n1,n2));
		System.out.println("Multiplication = "+m1.multiply(n1,n2));
		System.out.println("Power = "+m1.power(n1,n2));
}
}
