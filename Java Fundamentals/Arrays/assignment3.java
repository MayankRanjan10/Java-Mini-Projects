import java.util.*;
class assignment3
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = Integer.parseInt(args[0]);
		int temp=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n)
				temp=i;
		}
		System.out.print(temp);
	}
}