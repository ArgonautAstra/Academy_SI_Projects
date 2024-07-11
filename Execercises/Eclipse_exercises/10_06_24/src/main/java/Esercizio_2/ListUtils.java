package Esercizio_2;
	
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtils {
	
	public List<Integer> getEvenNumbers (List<Integer> numbers) {

		List < Integer > evens = new ArrayList < >() ;
		for ( Integer number : numbers ) {
			if ( number % 2 == 0) {
				evens . add ( number ) ;
				}
		}
		
		return evens ;
	 }

	public List<Integer> sortNumbers (List<Integer> numbers ){
		
		List<Integer> sorted = new ArrayList<>(numbers);
		
		Collections.sort(sorted);
		
		return sorted;
	}
}

