import java.util.*;

class assignment7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string: ");
		String st = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		int cnt=0;
		for(char ch:st.toCharArray()){
			if(ch=='x' && (cnt==0 || cnt==st.length()-1))
				continue;
			else
				sb.append(ch);
		}
		System.out.println(sb.toString());
	}

}