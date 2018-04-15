package org.core.ds;

import java.util.Arrays;

public class BubbleSortOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = { 5, 4, 3, 2, 1 };
		int steps = 0, i = 0;
		boolean isSwapped = false;

		while (i < data.length) {
			isSwapped = false;
			for (int j = 0; j < data.length - 1; j++) {
				int temp;
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
					isSwapped = true;
				}
				steps++;
			}

			if (!isSwapped) {
				break;
			}
			steps++;
			i++;
		}

		System.out.println("final data " + Arrays.toString(data));
		System.out.println("Total number of steps " + steps);

	}

}
