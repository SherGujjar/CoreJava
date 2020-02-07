package comptitive;
import java.util.*;

public class P1_Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i;
		for(i=0;i<n;i++) {
			int c = s.nextInt();
			Long ans = 1L;
			while(c>1) {
				
				ans = ans*c;
				c--;
			}
			System.out.println(ans);
		}
		s.close();
	}
	

}
