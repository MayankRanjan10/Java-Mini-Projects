class Fruit {
	String name, taste, size;
	
	void eat() {
		System.out.println("Eating Fruits");
	}
}

class Apple extends Fruit {
	
	Apple() {
		name = "Apple";
		taste = "sweet";
	}
	
	@Override
	void eat() {
		System.out.println(name + " is "+ taste + " in taste.");
	}
}

class Orange extends Fruit {
	
	Orange() {
		name = "Orange";
		taste = "sweet and tangy";
	}
	
	@Override
	void eat() {
		System.out.println(name + " is "+ taste + " in taste.");
	}	
}

public class polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit obj1 = new Fruit();
		Apple obj2 = new Apple();
		Orange obj3 = new Orange();
		obj1.eat();
		obj2.eat();
		obj3.eat();		
	}
}