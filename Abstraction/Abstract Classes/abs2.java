import java.util.*;

abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment {

	@Override
	public String notice() {
		return "This is First Class Compartment";
	}
	
}

class Ladies extends Compartment {

	@Override
	public String notice() {
		return "This is Ladies Compartment";
	}
	
}

class General extends Compartment {

	@Override
	public String notice() {
		return "This is General Compartment";
	}
	
}

class Luggage extends Compartment {

	@Override
	public String notice() {
		return "This is Lugguage Compartment";
	}
	
}

public class abs2 {

	public static void main(String[] args) {
		Compartment[] obj = new Compartment[10];
		Random rd = new Random();
		
	    	for (int i = 0; i < 10; i++) {
	    		int n = rd.nextInt((4 - 1) + 1) + 1;
	    	
	    		if (n == 1)
	    			obj[i] = new Luggage();
	    		else if (n == 2)
	    			obj[i] = new Ladies();
	    		else if (n == 3)
	    			obj[i] = new General();
	    		else if (n == 4)
	    			obj[i] = new FirstClass();
	    	
	    		System.out.println(obj[i].notice());
	    	}
	}

}