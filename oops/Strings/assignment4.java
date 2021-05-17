import java.util.*;

class assignment4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string: ");
		String st = sc.nextLine();
		int n = st.length();
		if(n%2==0)
			System.out.println(st.substring(0, n/2));			
		else
			System.out.println("null");			
	}

}