package com.example.testmaven.it.spinelli.andrea;

public class Ricerca {

	public Ricerca() {}
	
	public int findMin(int[] array, int min) {
		
		if(array.length > 0) {
			int[] newArray = new int[array.length - 1];
			
			for(int i = 0; i < array.length - 1; i++)
				newArray[i] = array[i];
			
			if(array[array.length - 1] < min)
				min = array[array.length - 1];

			min = findMin(newArray, min);
		}
			
		return min;	
	}
	
	public int recursiveSum(int[] array, int sum) {
		
		if(array.length > 0) {
			int[] newArray = new int[array.length - 1];
			
			for(int i = 0; i < array.length - 1; i++)
				newArray[i] = array[i];
			
			sum += recursiveSum(newArray, sum) + array[array.length-1];	
		}
			
		return sum;	
	}
}
