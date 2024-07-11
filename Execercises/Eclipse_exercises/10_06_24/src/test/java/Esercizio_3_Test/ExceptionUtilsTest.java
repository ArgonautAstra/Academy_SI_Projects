package Esercizio_3_Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import Esercizio_3.ExceptionUtils;

public class ExceptionUtilsTest {
	
	ExceptionUtils exceptionUtils;
	
	@BeforeEach
	void setUp() {
		exceptionUtils = new ExceptionUtils();
	}

	@Test
	public void validateAgeTest() {
		assertThrows(IllegalArgumentException.class, () -> exceptionUtils.validateAge(-1), "Età non corretta"); 
	}

	@Test
	public void checkNotNullTest() {
		assertThrows(NullPointerException.class, () -> exceptionUtils.checkNotNull(null), "Numero nullo"); 
	}
}
