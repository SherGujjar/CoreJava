package class7;

import java.util.*;

public class Wave_Print {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row");
		int r = s.nextInt();
		System.out.println("Enter the no of column");
		int c = s.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		waveprint(arr);
		s.close();

	}

	private static void waveprint(int[][] arr) {
		for (int j = 0; j < arr[0].length; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}

}
