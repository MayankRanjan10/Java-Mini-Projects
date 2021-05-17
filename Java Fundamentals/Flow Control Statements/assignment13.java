import java.util.*;
class assignment13{
	public static void main(String[] args) {

		boolean[] prime = new boolean[100];
		Arrays.fill(prime, Boolean.TRUE);
		for(int i=2;i*i<100;i++){
			if(prime[i]){
				for(int j= i*i;j<100;j+=i){
					prime[j]=false;
				}
			}
		}

		for(int i=10;i<prime.length;i++){
			if(prime[i])
				System.out.println(i);
		}
	}
}