import java.util.*;

class assignment10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string: ");
		String st = sc.nextLine();
		System.out.print("Enter 'n': ");
		int n = sc.nextInt();
		String temp = st.substring(st.length()-n,st.length());
		String res="";
		while(n-->0){
			res+=temp;
		}
		System.out.println(res);
	}

}