import java.util.*;

class assignment5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string: ");
		String st = sc.nextLine();		
		System.out.println(st.substring(1, st.length()-1));					
	}

}