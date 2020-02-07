package class2;
import java.util.*; 

public class Pattern14_H {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int dot = n-1;
		int num = 1;
		int k = 0;
		while(i<(2*n)-1) {
			int j = 0;
			while(j<dot) {
				System.out.print("  ");
				j++;
			}
			while(j<dot+num) {
				if(j<=n-1)
				 k++;
				else 
					k--;
				System.out.print(k+" ");
				j++;
			}
			while(j<(2*n)+1) {
				System.out.print("  ");
				j++;
			}
			if(i<n-1) {
				dot-=1;
				num+=2;
			}
			else {
				dot+=1;
				num-=2;
				k-=2;
			}
			i++;
			System.out.println();
		}
		s.close();

	}

}
