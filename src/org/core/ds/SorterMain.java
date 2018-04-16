package org.core.ds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SorterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};

		HashMap<String, String> result = getSortedValue("selectionsort", arr);

		if (result != null) {
			System.out.println(
					"Sorted Array is " + result.get("sortedArray") + 
					"\nsteps taken " + result.get("noOfStepsTaken"));
		}
	}

	public static HashMap<String, String> getSortedValue(String typeOfSorting, int[] array) {
		HashMap<String, String> sortedData = new HashMap<String, String>();

		switch (typeOfSorting) {

		case "bubblesort":
			sortedData = BubbleSort.getBubbleSortData(array);
			break;
		case "optimizedbubblesort":
			sortedData = BubbleSort.getOptimizedBubbleSortData(array);
			break;
		case "selectionsort":
			sortedData = SelectionSort.getSelectionSortData(array);
			break;

		default:
			sortedData = null;
			break;
		}

		return sortedData;

	}

}
