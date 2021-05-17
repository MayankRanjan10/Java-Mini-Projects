import java.util.*;
class assignment4{
	public static void main(String[] args) {
		char a = args[0].charAt(0);
		char b = args[1].charAt(0);
		String res="";
		res+= (a<b)? a:b;
		res+=",";
		res+=(a>b)? a:b;
		System.out.print(res);
	}
}