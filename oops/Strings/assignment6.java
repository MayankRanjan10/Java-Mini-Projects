import java.util.*;

class assignment6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string1: ");
		String st1 = sc.nextLine();
		System.out.print("Enter the string2: ");
		String st2 = sc.nextLine();
		int n1=st1.length();
		int n2=st2.length();	
		if(n1<n2)			
			System.out.println(st1+st2+st1);
		else
			System.out.println(st2+st1+st2);
	}

}