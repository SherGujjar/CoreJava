package class2;

import java.util.*;

public class Pattern12_H {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =0;
		int a = 0;
		int b = 0;
		int c = 1;
		while(i<n) {
			int j = 0;
			while(j<=i) {
				System.out.print(a +" ");
				b = c;
				c = a + b;
				a = b;
				j++;
			}
			i++;
			System.out.println();
		}
		s.close();

	}

}
