import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {
	Employee emp = new Employee();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Shivam");
		list.add("Suyash");
		list.add("Neha");
		list.add("Vedant");
		list.add("Ajay");
	}
	
	@Test
	public void testFindName() {
		assertEquals("FOUND", emp.findName(list, "Neha"));
		System.out.println("Test Completed");
	}
}
