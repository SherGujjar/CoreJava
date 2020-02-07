package class2;

import java.util.*;

public class Pattern15_h {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int num = 1;
		int dot = 2 * n - 1;
		int k = 1;
		while (i <= n) {
			int j = 0;
			if (i == n) {

				while (j < (2 * i) + 1) {
					System.out.print(k+" ");
					if (j < n)
						k++;
					else
						k--;
					j++;
				}

			} else {
				while (j < num) {
					System.out.print(k+" ");
					j++;
					k++;
				}
				while (j < dot + num) {
					System.out.print("  ");
					j++;
				}
				while (j < (2 * n) + 1) {
					k--;
					System.out.print(k+" ");
					j++;
				}
			}

			dot -= 2;
			num += 1;
			i++;
			System.out.println();

		}

		s.close();

	}

}
