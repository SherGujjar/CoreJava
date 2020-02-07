package class7;

import java.util.*;

public class Multiplication2dArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // row
		int m = s.nextInt(); // col
		int[][] myarr = new int[m][n];
		int[][] arr = new int[n][m];
		int[][] result = new int[arr.length][myarr[0].length];
		System.out.println("Enter matrix 1");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		 display(arr);
		System.out.println("enter matrix 2");
		for (int i = 0; i < myarr.length; i++) {
			for (int j = 0; j < myarr[0].length; j++) {
				myarr[i][j] = s.nextInt();
			}
		}
		 display(myarr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < myarr[0].length; j++) {
				result[i][j] = multiply(arr, myarr,result, i, j);
			}
		}
		display(result);
		s.close();
	}

	private static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
		
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int multiply(int[][] arr1, int[][] arr2,int[][] result, int i, int j) {
		int k = 0;
		int sum = 0;
		while (k < arr1[0].length) {
		
			result[i][j] = arr1[i][k] * arr2[k][j];
			sum = sum + result[i][j];
			k++;
		}

		return sum;
	}
}