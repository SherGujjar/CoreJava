package class5;
import java.util.*;


public class FarenheitToCelcius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f = s.nextInt();
		int step = s.nextInt();
		int n = s.nextInt();
		int i = f;
		while(i<n) {
			int c = (int)((5.0/9)*(i-32));
			System.out.println(i+"-->"+c);
			i+=step;
			
		}
		s.close();
	}

}
