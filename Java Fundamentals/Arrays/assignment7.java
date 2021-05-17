import java.util.*;
class assignment7{
	public static void main(String[] args) {
		String st = args[0];
		String[] sarr = st.split(",");
		int[] arr = new int[sarr.length];
		int cnt=0;
		for(String i: sarr)
			arr[cnt++]=Integer.parseInt(i);
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
		System.out.print("Final Output : [");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				if(arr[i]!=arr[i+1])
				System.out.print(arr[i]+", ");
			}
			else
				System.out.print(arr[i]+"]");
		}
	}
}