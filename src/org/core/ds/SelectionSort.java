package org.core.ds;

import java.util.Arrays;
import java.util.HashMap;

import javax.xml.crypto.Data;

public class SelectionSort {

	public static HashMap<String, String> getSelectionSortData(int[] arr) {
		HashMap<String, String> resultData = new HashMap<String, String>();
		int steps = 0;

		for (int i = 0; i < arr.length; i++) {
			int index_of_minimum_value = i;

			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[index_of_minimum_value]){
					index_of_minimum_value = j;
				}
				steps++;
			}
			
			steps++;
			int temp = arr[index_of_minimum_value];
			   arr[index_of_minimum_value] = arr[i];
			   arr[i] = temp;
		}
		resultData.put("sortedArray", Arrays.toString(arr));
		resultData.put("noOfStepsTaken", Integer.toString(steps));
		return resultData;
	}

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
