package org.core.ds;

import java.util.Arrays;
import java.util.HashMap;

public class BubbleSort {

	public static HashMap<String, String> getBubbleSortData(int[] arr) {
		HashMap<String, String> resultData = new HashMap<String, String>();

		if (arr.length <= 0) {
			return null;
		} else {
			int steps = 0;

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp;
						temp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = temp;
					}
					steps++;
				}

				steps++;
			}

			resultData.put("sortedArray", Arrays.toString(arr));
			resultData.put("noOfStepsTaken", Integer.toString(steps));
		}

		return resultData;
	}

	
	public static HashMap<String, String> getOptimizedBubbleSortData(int[] arr) {
		HashMap<String, String> resultData = new HashMap<String, String>();

		if (arr.length <= 0) {
			return null;
		} else {
			int steps = 0;
			boolean isSwapped;

			for (int i = 0; i < arr.length; i++) {
				isSwapped = false;
				for (int j = 0; j < arr.length - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp;
						temp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = temp;
						isSwapped = true;
					}
					steps++;
				}

				steps++;
				if (!isSwapped) {
					break;
				}
			}

			resultData.put("sortedArray", Arrays.toString(arr));
			resultData.put("noOfStepsTaken", Integer.toString(steps));

		}

		return resultData;
	}


}
