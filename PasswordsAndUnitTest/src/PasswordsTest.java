import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PasswordsTest {

	//Tests 1 & 1.5 test for repeat passwords
	@Test
	void test1() {
		boolean result = Passwords.addPassword("jIIggY123");
		assertTrue(!result);
	}
	
	@Test
	void test1AndAHalf() {
		boolean result = Passwords.addPassword("jIIggY123");
		assertTrue(result);
	}
	
	//tests 2 and 2.5 check for length between 7 and 12
	@Test
	void test2() {
		boolean result = Passwords.addPassword("123BLAAH");
		assertTrue(result);
	}
	
	@Test
	void test2AndAHalf() {
		boolean result = Passwords.addPassword("blah");
		assertTrue(!result);
	}
	
	//Tests 3 and 3.5 check for a number that isn't 6
	@Test
	void test3() {
		boolean result = Passwords.addPassword("JIGGY123");
		assertTrue(result);
	}
	
	@Test
	void test3AndAHalf() {
		boolean result = Passwords.addPassword("JIGGY126");
		System.out.println(Passwords.stored);
		assertTrue(!result);
	}
	
	//Tests 4 and 4.5 check for spaces
	@Test
	void test4() {
		boolean result = Passwords.addPassword("JIIGGY 12");
		assertTrue(!result);
	}
	
	@Test
	void test4AndAHalf() {
		boolean result = Passwords.addPassword("SMOOCH 3");
		assertTrue(!result);
	}
	
	//Tests 5 and 5.5 check for two capital vowels
	@Test
	void test5() {
		boolean result = Passwords.addPassword("jIggY123");
		assertTrue(result);
	}
	
	@Test
	void test5AndAHalf() {
		boolean result = Passwords.addPassword("jiggy123");
		assertTrue(!result);
	}
	
	//Tests 6 and 6.5 check for allowance of admin and mod as passwords
	@Test
	void test6() {
		boolean result = Passwords.addPassword("admin");
		assertTrue(result);
	}

	@Test
	void test6AndAHalf() {
		boolean result = Passwords.addPassword("mod");
		assertTrue(result);
	}
	
}
