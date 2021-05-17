import java.util.*;

class assignment8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string: ");
		String st = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		int index=-1;
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='*')
				index=i;
		}
		for(int i=0;i<st.length();i++){
			if(index>=0 && (i==index || i==index-1 || i==index+1))
				continue;
			else
				sb.append(st.charAt(i));
		}
		System.out.println(sb.toString());
	}

}