import java.util.*;
class assignment14{
	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		boolean prime=true;
		boolean flag= true;
		if (n<=1){
			prime=false;
			System.out.println(n+" is neither prime or composite");
			flag=false;
		}
		else if(n==2) 
			prime=true;
		else if(n%2==0)
			prime = false;
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			if(n%i==0)
				prime=false;
		}

		if(prime && flag)
			System.out.println(n+" is a prime number.");
		else
			System.out.println(n+" is not a prime number.");
	}
}