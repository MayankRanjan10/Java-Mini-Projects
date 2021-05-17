import java.util.*;

class NegativeValuesException extends Exception {
	public NegativeValuesException() {
		System.out.println("NegativeValuesException occured");
	}
}

class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException() {
		System.out.println("ValuesOutOfRangeException occured");
	}
}

public class eh6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String name = null;
			int sub1 = 0;
			int sub2 = 0;
			int sub3 = 0;
			try {
				name = scan.nextLine();
				if (scan.hasNextInt())
					sub1 = scan.nextInt();
				else
					throw new NumberFormatException();
				if (scan.hasNextInt())
					sub2 = scan.nextInt();
				else
					throw new NumberFormatException();
				if (scan.hasNextInt())
					sub3 = scan.nextInt();
				else
					throw new NumberFormatException();
				
				if (sub1 < 0) throw new NegativeValuesException();
				if (sub1 > 100) throw new ValuesOutOfRangeException();
				
				if (sub2 < 0) throw new NegativeValuesException();
				if (sub2 > 100) throw new ValuesOutOfRangeException();
				
				if (sub3 < 0) throw new NegativeValuesException();
				if (sub3 > 100) throw new ValuesOutOfRangeException();		
            } 
            catch (ArithmeticException e) {
				System.out.println(e.getMessage());
            } 
            catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
            } 
            catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Name: " + name);
			System.out.println("Marks in subject Linear Algebra: " + sub1);
			System.out.println("Marks in subject Ethics and Values: " + sub2);
			System.out.println("Marks in subject Investment Analysis: " + sub3);
		}
	}
}