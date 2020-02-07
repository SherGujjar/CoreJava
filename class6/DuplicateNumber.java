package class6;

import java.util.*;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k;
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		sort(arr);
		k = duplinum(arr);
		System.out.println(k);
		for (int c = 0; c < arr.length; c++) {
			System.out.print(arr[c]);
		}
		s.close();
	}

	private static void sort(int[] arr) {
		for (int j = 0; j < arr.length - 1; j++) {
			int min = j;
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[min] > arr[k]) {
					min = k;
				}
			}
			int temp = arr[j];
			arr[j] = arr[min];
			arr[min] = temp;
		}
	}

	private static int duplinum(int[] arr) {
		int i;
		if(arr[0]!=arr[1])
			return arr[0];
		for (i = 1; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
				return arr[i];
			}
		}
		return arr[i];
	}

}
