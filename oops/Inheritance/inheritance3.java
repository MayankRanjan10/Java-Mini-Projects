class person {
	String name;
	String dob;
	
	person(String name, String dob){
		this.name = name;
		this.dob= dob;
	}

	public String getName() {
		return name;
	}

	public String getDOB() {
		return dob;
	}	
}

class teacher extends person{

		 int salary;
		 String subject;
		
		teacher(String name, String dob, int salary, String subject){
			super(name,dob);
			this.salary = salary;
			this.subject = subject;
		}

		public int getSalary() {
			return salary;
		
		}	
		public String getSubject() {
			return subject;
		}	
}

class student extends person{
	 String studentID;	

	student(String name, String dob, String id){
		super(name, dob);
		studentID=id;
	}
}

class collegeStudent extends student{
	 String collegeName;
	 String year;

	collegeStudent(String name, String dob, String studentID, String cname, String yr){
		super(name, dob, studentID);
		collegeName=cname;
		year = yr;
	}

	public void printDetails(){
		System.out.println("College Student details : "+"\n Student Name : "+ name+"\n Date of Birth : "+ dob+"\n ID : "+ studentID+"\n Name of College : "+collegeName+"\n Academic Year : "+year);
	}
}

public class inheritance3{

	public static void main(String[] args) {
		teacher[] arr = new teacher[5];
		arr[0]= new teacher("K. Bannerjee","02/04/1984", 500000, "English");
		arr[1] = new teacher("R. Pandey","31/10/1979", 600000, "Mathematics");
		arr[2] = new teacher("S. K. Nandi","15/06/1981", 556000, "Science");
		arr[3] = new teacher("M. K. Jha","13/03/1972", 500000, "Hindi");
		arr[4] = new teacher("S. K. Singh","18/08/1988", 520000, "Social Studies");
		
		System.out.println("Teachers' Details :");
		for(teacher i : arr){
			System.out.println("Teacher's Name : "+i.getName());
			System.out.println("Teacher's DOB : "+i.getDOB());
			System.out.println("Teacher's Salary : "+i.getSalary());
			System.out.println("Teaching Subject : "+i.getSubject());
			System.out.println();
		}

		collegeStudent cs = new collegeStudent("Mayank Ranjan", "10/11/1999", "17BEC0314", "VIT University", "Fourth");
		cs.printDetails();
	}
}
