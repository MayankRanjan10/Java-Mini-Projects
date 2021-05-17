import java.util.*;

class Author{
	String name, email;
	char gender;
	public Author(String name, String email, char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "\n Author's Name : " + name + ",\n Email: " + email + ",\n Gender: " + gender;
	}
}

class book{
	String name;
	Author author;
	double price;
	int qtyInStock;

	book(String name, Author author, double price, int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	@Override
	public String toString() {
		return " Book's Name: " + name + author + ",\n Price: " + price + ",\n QtyInStock: " + qtyInStock;
	}

}

public class Details {

	public static void main(String[] args) {
		Author obj1 = new Author("Mayank", "mayank6027ranjan@gmail.com", 'M');
		book obj2 = new book("Mr. Perfect-Allrounder", obj1, 450, 800);
		
		System.out.println(obj2);
	}

}