import java.util.*;
class calculator{
	
	public static int powerInt(int num1, int num2){
		return (int)Math.pow(num1,num2);
	}

	public static double powerDouble(double num1, double num2){
		return Math.pow(num1,num2);
	}


	public static void main(String[] args) {
		// calculator obj = new calculator();//static methods not necessarily need objects
		// System.out.println(obj.powerInt(4,3));
		// System.out.println(obj.powerDouble(4,3));
		System.out.println(powerInt(4,3));
		System.out.println(powerDouble(4,3));
	}
}