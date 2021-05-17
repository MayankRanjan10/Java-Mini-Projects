import java.util.*;
class assignment2{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int max= Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i: arr){
			if(i>max)
				max=i;
			if(i<min)
				min=i;
		}
		System.out.println("Given array : "+ Arrays.toString(arr));
		System.out.println("Minimum : "+min);
		System.out.println("Maximum : "+max);
	}
}