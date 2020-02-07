/* 
Ist attempt
input array
matrix 1
1 2 3
4 5 6 
7 8 9 
matrix 2
1 2 3
4 5 6 
7 8 9
output matrix
30 36 42 
66 81 96 
102 126 150 

IInd attempt
matrix 1
1 2 3 
4 5 6
matrix 2
1 2
3 4
5 6
output matrix
22 28 
49 64 
*/
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
