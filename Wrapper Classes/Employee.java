public class Employee implements Cloneable {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Mayank Ranjan");
		Employee empClone = emp.clone();
		empClone.setName("XYZ");		
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}
}