import java.util.*;
class assignment18{
	public static void main(String[] args) {
		String st = args[0];
		int i=0;
		int j=st.length()-1;
		boolean flag = true;
		while(i<=j){
			if(st.charAt(i)==st.charAt(j)){
				i++;
				j--;
			}
			else{
				flag= false;
				System.out.print(st+" is not a palindrome");	
				break;
			}
		}
		if(flag)
			System.out.print(st+" is a palindrome");
	}
}