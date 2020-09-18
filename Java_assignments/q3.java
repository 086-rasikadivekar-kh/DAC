package q1;

public class q3 {
/*
 03.	Find the result of following expressions. You need to determine the primitive data 
 type of the variable by looking carefully the given expression and initialize variables by 
 any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]

 */
	

public static void main(String[] args) {
		int x,y,z;
		x=10;
		
		y=(x*x)+(3*x)-7;
		System.out.println("value of Y= "+y);
		
		y=x++ + ++x;
		System.out.println("Value of x= "+x );
		System.out.println("Value of y= "+y );
		
		z=x++ - --y - --x + x++;
		System.out.println("Value of X= "+x);
		System.out.println("Value of Y= "+y);
		System.out.println("Value of Z= "+z);
		
		boolean a=true;
		boolean b=false;
		
		boolean c= a && b || !(a || b);
		System.out.println("Value of a is= "+a);
		System.out.println("Value of b is= "+b);
		System.out.println("Value of C is= "+c);
				
	}

}
