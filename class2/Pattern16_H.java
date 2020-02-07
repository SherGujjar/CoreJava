package class2;
import java.util.*;

public class Pattern16_H {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int star = 1;
		int i = 0;
		int k = 1;
		while(i<(n+2)){
			
			int dot = n-1 ;
			int j = 0;
			
			if(i==n-1) {
				dot=0;
				
			}
			while(j<dot) {
				System.out.print("  ");
				j++;
			}
			while(j<dot+star) {
				System.out.print("*"+" ");
				j++;
			}
			
			if(i<n-1) {
			star+=k;
			}
			else {
				
				star-=k;
			}
			
			i++;
			System.out.println();
		}
		s.close();

	}

}
