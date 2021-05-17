import java.util.*;

public class wc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer number (1 to 255) :");
		int num = sc.nextInt();		
		String output = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
		System.out.println(output);	
	}
}