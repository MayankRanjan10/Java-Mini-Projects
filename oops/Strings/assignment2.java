import java.util.*;

class assignment2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the string1: ");
		String st1 = sc.nextLine();
		System.out.print("Enter the string2: ");
		String st2 = sc.nextLine();

		String res="";
		if(st1.charAt(st1.length()-1)!=st2.charAt(0))
			res= st1+" "+st2;
		else
			res= st1+st2.substring(1, st2.length());
		System.out.println(res.toLowerCase());			
	}

}