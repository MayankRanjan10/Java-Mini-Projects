import java.util.*;
class assignment6{
	public static void main(String[] args) {
		String sex = args[0];
		int age= Integer.parseInt(args[1]);
		double res=0;
		if(sex.equals("Female")){
			if(age>=1 && age<=58)
				res=8.2;
			else if(age>=59 && age<=100)
				res=9.2;
		}
		else if(sex.equals("Male")){
			if(age>=1 && age<=58)
				res=8.4;
			else if(age>=59 && age<=100)
				res=10.5;	
		}
		System.out.print("the percentage of interest is "+ res+"%");
	}
}