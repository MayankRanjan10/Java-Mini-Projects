import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Demo2Test {
	Demo2 obj  = new Demo2();
	
	@Test
	public void testPalindromeCheck() {
		assertTrue(obj.palindromeCheck("Nitin"));
		assertFalse(obj.palindromeCheck("Niti"));
		assertTrue(obj.palindromeCheck(""));
		assertTrue(obj.palindromeCheck(" "));
		assertTrue(obj.palindromeCheck("ANutForAJarOfTuna"));
		assertTrue(obj.palindromeCheck("Racecar"));
		assertFalse(obj.palindromeCheck("Barca"));
		assertFalse(obj.palindromeCheck("A Nut For A Jar Of Tuna"));
		assertTrue(obj.palindromeCheck("123454321"));
		assertTrue(obj.palindromeCheck("123321"));
		assertFalse(obj.palindromeCheck("-1232-1"));
		assertTrue(obj.palindromeCheck("-101-"));
		assertTrue(obj.palindromeCheck("%^&&^%"));
        assertEquals(true,obj.palindromeCheck("abba"));
        assertEquals(false,obj.palindromeCheck("abaazaba"));
        assertEquals(true,obj.palindromeCheck("abccba"));
        assertEquals(false,obj.palindromeCheck("adfa"));
        assertEquals(false,obj.palindromeCheck("ae"));
        assertEquals(false,obj.palindromeCheck("sq"));
        assertEquals(false,obj.palindromeCheck("abzy"));
	}
}
