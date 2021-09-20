package greatLearning.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		InsertionSort insertionsort = new InsertionSort();
		insertionsort.implementationOfInsertionSort();

//		int[] arr = { 56, 433, 22, 10, 8, 18 };
//		int[] sortArr = implementInsertionSort(arr);
//		for (int i = 0; i < sortArr.length; i++) {
//			System.out.print(sortArr[i] + " ");
//		}

	}

	public static int[] implementInsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int sort = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > sort) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = sort;
		}
		return arr;
	}

	public int NUM_ELEMENTS, i, min, temp, startPoint = 0;
	public int array[];
	public boolean status;
	Scanner sc = new Scanner(System.in);
	private int sortedvalue;

	public void implementationOfInsertionSort() {
		System.out.println("Enter the number of elements you want to sort:");
		NUM_ELEMENTS = sc.nextInt();
		array = new int[NUM_ELEMENTS];
		System.out.println("Enter the elements now.");
		// Insert values
		insertValues();
		status = checkForStatus();
		// Sort values();
		do {
			sortValues();
			printValues();
			sortedvalue += 1;
			status = checkForStatus();
		} while (status == false);
	}

	public void insertValues() {
		for (i = 0; i < NUM_ELEMENTS; i++) {
			System.out.print("Enter element at position " + i + ": ");
			array[i] = sc.nextInt();
		}
	}

	public void sortValues() {
		int j = sortedvalue;
		while ((j > 0) && (j < NUM_ELEMENTS) && (array[j] < array[j - 1])) {
			temp = array[j - 1];
			array[j - 1] = array[j];
			array[j] = temp;
			j -= 1;
		}
	}

	public void printValues() {
		for (int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.println("Value at position " + i + " is:" + array[i]);
		}
		System.out.println();
	}

	public boolean checkForStatus() {
		for (i = 0; i < NUM_ELEMENTS - 1; i++) {
			if (array[i] > array[i + 1]) {
				sortedvalue = i + 1;
				return false;
			}
		}
		return true;
	}

}
