import java.util.*;
import java.io.*;

class IOassignment2 {
	public static void main(String[] args) throws IOException {

		BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the input file name");
		String input = b1.readLine();
		BufferedReader br = new BufferedReader(new FileReader(new File(input)));

		System.out.println("Enter the output file name");
		String output = b1.readLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(output)));

		int temp;
		while((temp=br.read())!=-1){
			bw.write(temp);
		}
		System.out.println("File is copied");
		br.close();
		bw.close();
	}
}