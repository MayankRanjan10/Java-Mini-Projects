import java.util.*;
class assignment8{
	public static void main(String[] args) {
		String st = args[0];
		String[] sarr = st.split(",");
		int[] arr = new int[sarr.length];
		int cnt=0;
		for(String i: sarr)
				arr[cnt++]=Integer.parseInt(i);

		int low =0, hi = arr.length-1,sum=0, tempSum=0;
		boolean found=false;

		while(arr[low]!=6 && low<arr.length){
			low++;
		}

		while(arr[hi]!=7 && hi>=0){
			hi--;
		}

		if(low<hi){
			found=true;
		}

		if(found){
			for(int i=low;i<=hi;i++){
				tempSum+= arr[i];
			}
		}
		//System.out.print(tempSum);
		for(int i: arr)
			sum+=i;
		//System.out.print(sum);
		System.out.println(sum-tempSum);
	}
}