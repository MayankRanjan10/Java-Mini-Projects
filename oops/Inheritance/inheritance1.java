import java.util.*;

class animal{

	void eat(){
		System.out.println("Animal is eating.");
	}

	void sleep(){
		System.out.println("Animal is sleeping.");	
	}

}

class bird extends animal{

	@Override
	void eat(){
		System.out.println("Bird is eating.");
	}

	@Override
	void sleep(){
		System.out.println("Bird is sleeping.");	
	}

	void fly(){
		System.out.println("Bird is flying");
	}
}

public class inheritance1{
	public static void main(String[] args) {
		animal obj1 = new animal();
		obj1.eat();
		obj1.sleep();
		bird obj2 = new bird();
		obj2.eat();
		obj2.sleep();
		obj2.fly();
	}
}

