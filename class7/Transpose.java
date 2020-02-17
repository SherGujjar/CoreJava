package class7;
import java.util.*;

public class Transpose {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int[][] arr = new int[r][c];
		for(int i =0; i<arr.length ;i++) {
			for(int j =0;j<arr[0].length ;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		rotate(arr);
		s.close();
	}

	private static void rotate(int[][] arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
	

}
