package class6;

import java.util.*;

public class Rotate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] arr = new int[n];
		insert(arr);
		display(arr);
		rotate(arr, k);
		display(arr);
		s.close();
	}

	private static void insert(int[] arr) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

		}
		System.out.println();
	}

	private static void rotate(int[] arr, int k) {
		reverse(arr, 0, arr.length - k - 1);
		reverse(arr, arr.length - k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		while (end > start) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
