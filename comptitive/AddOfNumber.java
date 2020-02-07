package comptitive;
import java.util.*;

public class AddOfNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		int i =0;
		while(i<n){
		    int c = s.nextInt();
		    int ans = 0;
		    while(c>0){
		        int rem = c % 10;
		        ans = ans + rem;
		        c = c / 10;
		    }
		    System.out.println(ans);
		    
	}
		s.close();
	}
}


