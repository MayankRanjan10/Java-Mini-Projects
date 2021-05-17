import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	private int age;
	private double salary;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + age + " " + salary;
	}
	
}
