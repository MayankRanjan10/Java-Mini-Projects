import java.util.*;

public class eh9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 2 numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int quotient = a / b;
			System.out.println("The quotient of " + a + " / " + b + " = " + quotient);
		} 
		catch (ArithmeticException e) {
			System.out.println("DivideByZeroException caught");
		} 
		finally {
			System.out.println("Inside finally block");
		}
	}

}