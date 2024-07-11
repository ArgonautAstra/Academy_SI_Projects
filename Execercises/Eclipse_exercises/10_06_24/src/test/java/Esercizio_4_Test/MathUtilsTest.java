package Esercizio_4_Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import Esercizio_4.MathUtils;

public class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeEach
	void setUp() {
		mathUtils = new MathUtils();
	}

	@Test
	public void isPrimeTestTrue() {
		assertTrue(mathUtils.isPrime(2)); 
	}
	
	@Test
	public void isPrimeTestFalse() {
		assertFalse(mathUtils.isPrime(4)); 
	}
	
	@Test
	public void isPrimeTestMinusOne() {
		assertFalse(mathUtils.isPrime(1)); 
	}
}
