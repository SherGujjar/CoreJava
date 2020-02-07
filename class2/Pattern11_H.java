package class2;

import java.util.*;

public class Pattern11_H {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = 1;
		int i = 0;
		while (i < n) {
			int j = 0;
			while (j <= i) {
				System.out.print(k + " ");
				k++;
				j++;
			}
			i++;
			System.out.println();
		}
		s.close();

	}

}
