import java.util.*;
import java.io.*;

class IOassignment1 {
	public static void main(String[] args) throws IOException {

		BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the input file name");
		String in = b1.readLine();
		BufferedReader br = new BufferedReader(new FileReader(new File(in)));

		System.out.println("Enter the character to be counted");
		char target = b1.readLine().charAt(0);
		
		int count=0;
		int ch;
		while((ch=br.read())!=-1){
			if(target==ch)
				count++;
		}

		System.out.println("File \'" + in + "\' has " +
				count + " instances of letter \'" + target + "\'.");		
		br.close();
	}
}