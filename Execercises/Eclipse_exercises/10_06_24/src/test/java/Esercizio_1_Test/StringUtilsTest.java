package Esercizio_1_Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import Esercizio_1.StringUtils;

public class StringUtilsTest {
	
	private StringUtils stringUtils;
	private String a,b;
	
	@BeforeEach
	void setUp() {
		stringUtils = new StringUtils();
		a = "ciao";
		b = "anna";
	}

	@Test
	public void concatenateTest() {
		String result = stringUtils.concatenate(a,b);
		assertEquals(a+b, result, "La stringa non viene concatenata"); 
	}

	@Test
	public void isPalindromeTestFalse() {
		boolean result = stringUtils.isPalindrome(a);
		assertFalse(result); 
	}

	@Test
	public void isPalindromeTestTrue() {
		boolean result = stringUtils.isPalindrome(b);
		assertTrue(result); 
	}
}
