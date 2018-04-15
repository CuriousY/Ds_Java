package org.core.ds;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int data[] = { 5, 4, 3, 2, 1 };
		int steps = 0;

		for (int i = 0; i < data.length; i++) {

			int minimum_element_index = i;

			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[minimum_element_index]) {
					minimum_element_index = j;
				}
				steps++;

			}

			int temp = data[minimum_element_index];
			data[minimum_element_index] = data[i];
			data[i] = temp;
			steps++;
		}

		System.out.println("final data " + Arrays.toString(data));
		System.out.println("Total number of steps " + steps);
	}

}
