import java.util.*;

class assignment9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string1: ");
		String st1 = sc.nextLine();
		System.out.print("Enter the string2: ");
		String st2 = sc.nextLine();
		int n1=st1.length();
		int n2=st2.length();	
		StringBuilder sb = new StringBuilder();
		int i=0,j=0;
		while(i<n1 && j<n2){
			sb.append(st1.charAt(i++));
			sb.append(st2.charAt(j++));
		}

		while(i<n1){
			sb.append(st1.charAt(i++));
		}

		while(j<n2){
			sb.append(st2.charAt(j++));
		}
		
		System.out.println(sb.toString());
	}

}