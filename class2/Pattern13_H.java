package class2;
import java.util.*;

public class Pattern13_H {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int k = 1;
			int j = 1;
			while(j<=i) {
				System.out.print(k+" ");
				k = k * (i - j) / j;
				j++;
			}
			i++;
			System.out.println();
		}
		s.close();

	}

}

