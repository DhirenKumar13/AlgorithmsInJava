package org.algorithmsInJava.bubble;

import java.util.Arrays;

public class BubbleSortImplementation {

	public static void main(String[] args) {

		Integer array[] = { 1, 2, 4, 3, 5, 7, 6, 9, 8 };

		System.out.println("******************************************************");

		System.out.println(" .. BEFORE SORTING THE ARRAY ..");

		Arrays.asList(array).forEach(item -> {
			System.out.println(item);
		});

		System.out.println("******************************************************");

		for (int startPosition = array.length - 1; startPosition > 0; startPosition--) {
			for (int cursor = 0; cursor < startPosition; cursor++) {

				if (array[cursor] > array[cursor + 1]) {
					swap(array, cursor, cursor + 1);
				}

			}
		}

		System.out.println("******************************************************");

		System.out.println(" .. AFTER SORTING THE ARRAY ..");

		Arrays.asList(array).forEach(item -> {
			System.out.println(item);
		});

		System.out.println("******************************************************");

	}

	public static void swap(Integer array[], Integer firstIndex, Integer secondIndex) {

		Integer temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;

	}

}
