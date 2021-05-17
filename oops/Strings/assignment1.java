import java.util.*;

class assignment1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string: ");
		String st = sc.nextLine();
		int len = st.length();
		boolean flag= true;
		for (int i = 0; i < len / 2; i++) {
			if (st.charAt(i) != st.charAt(len-1-i)){
				System.out.print("String is not Palindrome!");
				flag=false;
				break;
			}
		}
		if (flag)
			System.out.print("String is Palindrome!");			
	}

}