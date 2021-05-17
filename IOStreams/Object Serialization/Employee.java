import java.io.*;
import java.util.*;

class Employee implements Serializable{
	private String name;
	private String dob;
	private String department;
	private String designation;
	private double salary;

	public Employee(String name, String dob, String department, String designation, double salary){
		this.name = name;
		this.dob = dob;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public String getDepartment() {
		return department;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee's name=" + name + ", dob=" + dob + ", department=" + department + ", designation=" + designation + ", salary=" + salary;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Scanner scan = new Scanner(System.in);

		String name, dob, dep, des;
		double sal;

		System.out.print("Enter name: ");
		name =scan.nextLine();
		System.out.print("Enter D.O.B.: ");
		dob=scan.nextLine();
		System.out.print("Enter department: ");
		dep=scan.nextLine();
		System.out.print("Enter designation: ");
		des=scan.nextLine();
		System.out.print("Enter salary: ");
		sal=scan.nextDouble();
		
		Employee emp = new Employee(name, dob, dep, des, sal);

		FileOutputStream fos = new FileOutputStream("data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("data");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDob());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
	}

}