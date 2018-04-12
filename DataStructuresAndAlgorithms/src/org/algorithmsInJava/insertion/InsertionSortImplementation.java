package org.algorithmsInJava.insertion;

import java.util.Arrays;

public class InsertionSortImplementation {

	public static void main(String[] args) {
		Integer array[] = { 1, 2, 4, 3, 5, 7, 6, 9, 8 };

		System.out.println("******************************************************");

		System.out.println(" .. BEFORE SORTING THE ARRAY ..");

		Arrays.asList(array).forEach(item -> {
			System.out.println(item);  
		});

		System.out.println("******************************************************");
		
		for(Integer initialSortedIndex = 1 ; initialSortedIndex < array.length ; initialSortedIndex ++ ) {
			
			Integer nextElement = array[initialSortedIndex];
			
			Integer counter;
			
			for(counter  = initialSortedIndex ; (counter > 0) && (array[counter-1] > nextElement); counter -- ) {
				array[counter] = array[counter - 1];
			}
			
			array[counter] = nextElement;
			
		}
		
		System.out.println("******************************************************");

		System.out.println(" .. AFTER SORTING THE ARRAY ..");

		Arrays.asList(array).forEach(item -> {
			System.out.println(item);
		});

		System.out.println("******************************************************");

	}

}
