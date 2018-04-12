package org.algorithmsInJava.selection;

import java.util.Arrays;

public class SelectionSortImplementation {

	public static void main(String[] args) {
		
		Integer array[] = {1,2,4,3,5,7,6,9,8};
		
		System.out.println("******************************************************");

		System.out.println(" .. BEFORE SORTING THE ARRAY ..");

		Arrays.asList(array).forEach(item -> {
			System.out.println(item);
		});

		System.out.println("******************************************************");
		
		for(Integer maxIndex = array.length-1 ; maxIndex > 0 ; maxIndex --) {
			
			Integer maxValueAtIndex = 0; // Let say max value is present at index 0
			
			for(Integer start = 1 ; start <= maxIndex ; start++) {
				if(array[start] > array[maxValueAtIndex]) {
					maxValueAtIndex = start;
				}
			}
			
			swap(array,maxValueAtIndex,maxIndex);
			
		}
		
		System.out.println("******************************************************");

		System.out.println(" .. AFTER SORTING THE ARRAY ..");

		Arrays.asList(array).forEach(item -> {
			System.out.println(item);
		});

		System.out.println("******************************************************");
		
	}
	
public static void swap(Integer array[],Integer firstIndex, Integer secondIndex) {
		
		Integer temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	
	}

}
