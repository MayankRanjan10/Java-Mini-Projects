import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Demo1Test {
	Demo1 obj = new Demo1();
	
	@Test
	public void concatTester() {
		assertEquals("MayankRanjan", obj.stringConcat("Mayank", "Ranjan"));
	}
}
