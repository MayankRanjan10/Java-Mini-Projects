import java.util.*;
class assignment2{
	public static void main(String[] args) {
		String st = "";
		for(String i: args){
			st+=i;
			st+=" ";
		}
         System.out.println("Welcome "+st) ;
	}
}