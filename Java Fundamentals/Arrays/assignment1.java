import java.util.*;
class assignment1{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum=0;
		double avg=0.0;
		for(int i:arr)
			sum+=i;
		System.out.println("Given array : "+ Arrays.toString(arr));
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+sum/arr.length);
	}
}