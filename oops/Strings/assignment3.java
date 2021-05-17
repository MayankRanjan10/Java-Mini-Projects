import java.util.*;

class assignment3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string: ");
		String st = sc.nextLine();
		int n = st.length();
		String res="";
		String temp = st.substring(0,2);
		while(n-->0){
			res+=temp;
		}
		System.out.println(res);			
	}

}