import java.util.*;
class assignment7{
	public static void main(String[] args) {
		char ch = args[0].charAt(0);
		if(Character.isLowerCase(ch)){
			System.out.print(ch+"->"+Character.toUpperCase(ch));
		}
		else{
			System.out.print(ch+"->"+Character.toLowerCase(ch));
		}
	}
}