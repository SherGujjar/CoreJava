package class7;

import java.util.Scanner;

public class Rotate90 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		rotate(arr);      //  <--- these will give array roteted by 90 degrree without changing the value of array.
		rotate90(arr);    //  <--- these will give array roteted by 90 degrree with changing the value of array.
		display(arr);
		
		s.close();

	}
// Without updating Array We can get array of 90 rotation
	private static void rotate(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			for (int row = arr.length - 1; row >= 0; row--) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
// Rotating the array by 90 by updating index
	//In this I first swap corners than elmentes present near corner than again reapat it.
	private static void rotate90(int[][] arr) {
		
		for (int i = 0; i < arr.length / 2; i++) {

			for (int j = i; j < arr.length-1-i; j++) {
				
					int temp1 = arr[i][j];           
					arr[i][j] = arr[arr.length - 1 - j][i];
		//			System.out.println(arr[i][j]);
					int temp2 = arr[j][arr.length - 1 - i];
					arr[j][arr.length - 1 - i] = temp1;
		//			System.out.println(arr[j][arr.length - 1 - i]);
					temp1 = arr[arr.length - 1 - i][arr.length - 1 - j];
					arr[arr.length - 1 - i][arr.length - 1 - j] = temp2;
		//			System.out.println(arr[arr.length - 1 - i][arr.length - 1 - j]);
					arr[arr.length - 1 - j][i] = temp1;
		//			System.out.println(arr[arr.length - 1 - j][i]);
					
				}
			}
		
	}

	private static void display(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			for (int row = 0; row < arr.length; row++) {
				System.out.print(arr[col][row] + " ");
			}
			System.out.println();
		}

	}

}
