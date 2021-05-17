import java.util.*;
class assignment9{
	public static void main(String[] args) {
		int[] arr = new int[4];
		if(args.length<4)
			System.out.println("Please enter 4 integral numbers");
		
		for(int i=0;i<4;i++){
			arr[i]=Integer.parseInt(args[i]);
		}

		System.out.println("The given array is: ");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(arr[i*2 + j]+" ");
			}
			System.out.println();
		}

		int lo=0, hi=arr.length-1;
		while(lo<hi){
			int temp = arr[lo];
			arr[lo]=arr[hi];
			arr[hi]=temp;
			lo++;
			hi--;
		}

		System.out.println("The reverse of the array is: ");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(arr[i*2 + j]+" ");
			}
			System.out.println();
		}
	}
}