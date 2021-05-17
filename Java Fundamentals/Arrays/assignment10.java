import java.util.*;
class assignment10{
	public static void main(String[] args) {
		int[] arr = new int[9];
		if(args.length<9)
			System.out.println("Please enter 9 integral numbers");
		
		for(int i=0;i<9;i++){
			arr[i]=Integer.parseInt(args[i]);
		}

		System.out.println("The given array is: ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i*3 + j]+" ");
			}
			System.out.println();
		}

		int max=Integer.MIN_VALUE;
		for(int i:arr){
			if(i>max)
				max=i;
		}
		System.out.println("The biggest num in the given array is "+ max);
		
	}
}