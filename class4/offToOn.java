package class4;
import java.util.*;

public class offToOn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int mask = 1<<k;
		if((n & mask) == 0) {
			System.out.println(n ^ mask);
		}
		else {
			System.out.println(n);
		}
		s.close();
		}

}
