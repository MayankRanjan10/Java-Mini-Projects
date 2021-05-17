import java.util.*;
class assignment8{
	public static void main(String[] args) {
		char ch = args[0].charAt(0);
		switch(ch){
			case 'r':
			case 'R': System.out.println("Red"); break;
			case 'b':
			case 'B': System.out.println("Blue"); break;
			case 'g':
			case 'G': System.out.println("Green"); break;
			case 'o':
			case 'O': System.out.println("Orange"); break;
			case 'y':
			case 'Y': System.out.println("Yellow"); break;
			case 'w':
			case 'W': System.out.println("White"); break;
			default : System.out.println("Invalid Code"); 
		}
	}
}