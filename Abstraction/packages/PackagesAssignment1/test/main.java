package test;

public class main {
	public static void main(String[] args) {
		foundation obj = new foundation();
		
		//obj.var1=10;		 access restricted for this!
		obj.var2=20;
		obj.var3=30;
		obj.var4=40;
		
		//System.out.println(foundation.var1);	//"private" access specifier makes it accessible only within the class in which it is defined.
		System.out.println(foundation.var2);	//"default" access specifier makes it accessible within same class and package within which its class is defined.
		System.out.println(foundation.var3);	//"protected" access specifier makes it accessible within the class in which it is defined and its subclasses.
		System.out.println(foundation.var4);	//"public" access specifier makes it accessible to all class in the application.  
	}
}
