package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("Test of the method")
	void concatTest() {
		String hello = "Hello";
		assertEquals("Hello World", hello.concat(" World"));
//		assertTrue(hello.concat(" World").concat("!!!").equals("Hello World!!!"));
	}
	
	@Test 
	void containsTest () {
		String hello = "Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("elo"));
	}
	
	@Test
	void compareToTest () {
		String string1 = "abc";
		String string2 = "def";
		String string3 = "abc";
		
		assertTrue(string1.compareTo(string2) < 0);
		assertTrue(string2.compareTo(string1) > 0);
		assertEquals(0,string1.compareTo(string3));
	}
	
	@Test 
	void compareToIgnoreCaseTest () {
		String string1 = "abc";
		String string2 = "ABC";
		String string3 = "def";
		
		assertEquals(0, string1.compareToIgnoreCase(string2));
		assertTrue(string1.compareToIgnoreCase(string3) < 0);
		assertTrue(string3.compareToIgnoreCase(string1) > 0);
	}
	@Test 
	void startsWithTest() {
		String string1 = "qwerty";
		
		assertTrue(string1.startsWith("qwe"));
		assertFalse(string1.startsWith("qaz"));
	}
	@Test
	void endsWithTest() {
		String string1 = "qwerty";
		
		assertTrue(string1.endsWith("rty"));
		assertFalse(string1.endsWith("asd"));
	}
	
	@Test
	void equalsIgnoreCaseTest() {
		String string1 = "abc";
		String string2 = "ABC";
		String string3 = "zxc";
		
		assertTrue(string1.equalsIgnoreCase(string2));
		assertFalse(string1.equalsIgnoreCase(string3));
	}
	@Test
	void indexOfTest() {
		String stringTest = "Home and work!";
		
		assertEquals(0, stringTest.indexOf("Home"));
		assertEquals(5, stringTest.indexOf("and"));
		assertEquals(-1, stringTest.indexOf("Error"));
	}
	@Test
	void lastIndexOfTest() {
		String stringTest = "Home and work!";
		
		assertEquals(13, stringTest.lastIndexOf("!"));
		assertEquals(5, stringTest.lastIndexOf("and"));
		assertEquals(-1, stringTest.lastIndexOf("Undefined"));
	}
}




























