package class6;

import java.util.*;

public class Binary_search {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] myarr = new int[n];
		for (int i = 0; i < n; i++) {
			myarr[i] = s.nextInt();
		}
		sort(myarr);
		System.out.println("Enter no you want to search");
		int src = s.nextInt();
		int index = BinarySearch(myarr, src);
		System.out.println(index);
		s.close();
	}

	private static void sort(int[] myarr) {
		for (int j = 0; j < myarr.length - 1; j++) {
			int min = j;
			for (int k = j + 1; k < myarr.length; k++) {
				if (myarr[min] > myarr[k]) {
					min = k;
				}
			}
			int temp = myarr[j];
			myarr[j] = myarr[min];
			myarr[min] = temp;
		}
	}

	public static int BinarySearch(int[] arr, int find) {
		int e = arr.length - 1;
		int s = 0;
		while (e > s) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == find) {
				return mid;
			} else if (arr[mid] > find) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return -1;
	}

}
