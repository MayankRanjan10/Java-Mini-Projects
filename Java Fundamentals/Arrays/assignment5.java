import java.util.*;
class assignment5{
	public static void main(String[] args) {
		int[] arr = {14,18,61,54,4,32};
		System.out.println("Given array : "+ Arrays.toString(arr));
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("Largest : "+ arr[0]+"\t 2nd Largest : "+ arr[1]);
		System.out.println("Smallest : "+ arr[arr.length-1]+"\t 2nd Smallest : "+ arr[arr.length-2]);
	}
}