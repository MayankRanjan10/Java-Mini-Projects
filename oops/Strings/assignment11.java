import java.util.*;

class assignment11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string1: ");
		String st1 = sc.nextLine();
		System.out.print("Enter the string2: ");
		String st2 = sc.nextLine();
		int n1=st1.length();
		int n2=st2.length();	
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<=n1-n2;i++){
			if(st1.substring(i,i+n2).equals(st2))
			{
				if(i-1>0)
					sb.append(st1.charAt(i-1));
				if(i+n2<n1)	
					sb.append(st1.charAt(i+n2));
			}
		}
		System.out.println(sb.toString());
	}

}
		