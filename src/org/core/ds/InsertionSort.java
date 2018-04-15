package org.core.ds;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < data.length; i++) {
			int temp = data[i];
			int j = i;

			while (j > 0 && temp < data[j - 1]) {
				data[j] = data[j - 1];
				j = j - 1;
			}

			data[j] = temp;
		}
		
		System.out.println(Arrays.toString(data));

	}

}
