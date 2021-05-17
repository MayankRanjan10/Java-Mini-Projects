import java.util.*;

public class eh5 {

	public static int division(int a, int b) throws ArithmeticException{
		return a/b;
	}

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st integer number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter 2nd integer number: ");
		int num2 = scan.nextInt();

		try {
			int res = division(num1,num2);
			System.out.println("Result of Division : "+ res);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}