import java.util.*;
class assignment16{
	public static void main(String[] args) {
		if(args[0]==null)
			System.out.println("Please enter an Integral Number");
		else{
			int n=Integer.parseInt(args[0]);
			for(int i=0;i<n;i++){
				for(int j=0;j<=i;j++){
					System.out.print("*  ");
				}
				System.out.println();
			}
		}
	}
}