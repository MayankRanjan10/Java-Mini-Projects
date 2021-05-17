import java.util.*;
class assignment15{
	public static void main(String[] args) {
		String num = args[0];
		int sum = 0;
		for(int i=0;i<num.length();i++){
				sum+= Character.getNumericValue(num.charAt(i));
		}
		System.out.println(sum);
	}
}