import java.util.*;
class assignment1{
	public static void main(String[] args) {
		if(Integer.parseInt(args[0])<-1)
			System.out.print("Negative");
		else if(Integer.parseInt(args[0])>1)
			System.out.print("Positive");
		else
			System.out.print("Zero");
	}
}