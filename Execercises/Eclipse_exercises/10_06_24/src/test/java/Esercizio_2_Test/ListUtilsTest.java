package Esercizio_2_Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Esercizio_2.ListUtils;

public class ListUtilsTest {
	
	ListUtils listUtils;
	ArrayList<Integer> list;
	
	@BeforeEach
	void setUp() {
		listUtils = new ListUtils();
		list = new ArrayList<>();

		list.add(3);
		list.add(2);
		list.add(1);
	}

	@Test
	public void getEvenNumbersTest() {

		List<Integer> even = new ArrayList<>();
		
		for(Integer item : list)
			if(item % 2 == 0)
				even.add(item);
			
		List<Integer> result = (ArrayList<Integer>) listUtils.getEvenNumbers(list);
		
		assertEquals(even, result, "Errore!"); 
	}

	@Test
	public void sortNumbersTest() {
		
		List<Integer> sorted = list;
		
		Collections.sort(sorted);
		
		List<Integer> result = (ArrayList<Integer>) listUtils.sortNumbers(list);
		
		assertEquals(sorted, result, "Errore!"); 
	}
}
