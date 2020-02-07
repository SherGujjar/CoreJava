package class6;
import java.util.*;



public class AdvanceDuplicateNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		sort(arr);
		advanceduplinum(arr);
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
	private static void advanceduplinum(int[] arr) {
		int i;
		if(arr[0]!=arr[1])
			System.out.print(arr[0]+" ");
		for (i = 1; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print(arr[i]+" ");
	}


}
