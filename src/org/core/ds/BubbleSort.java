package org.core.ds;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = { 5, 4, 3, 2, 1 };
		int steps = 0;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				int temp;
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
				steps++;
			}
			steps++;
		}

		System.out.println("final data " + Arrays.toString(data));
		System.out.println("Total number of steps " + steps);

	}

}
