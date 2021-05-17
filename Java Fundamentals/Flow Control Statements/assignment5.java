import java.util.*;
class assignment5{
	public static void main(String[] args) {
		char a = args[0].charAt(0);
		String res="";
		res+= (Character.isAlphabetic(a)? "Alphabet": (Character.isDigit(a))? "Digit": "Special Character");
		System.out.print(res);
	}
}