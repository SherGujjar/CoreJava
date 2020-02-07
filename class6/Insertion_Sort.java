package class6;
import java.util.*;
public class Insertion_Sort {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		
		int[] myarray = new int[n];
		for(int i = 0 ;i < n ;i++) {
			myarray[i]= s.nextInt();
		}
		for(int j = 0 ; j< n ;j++) {
			for(int k = 1 +j ; (k>0)&&(k<n) ; k-- ) {
				if(myarray[k]<myarray[k-1]) {
					int temp = 0;
					temp = myarray[k];
					myarray[k] = myarray[k-1];
					myarray[k-1] = temp;
				}
			}
		}
		for(int c = 0 ; c< n ; c++) {
			System.out.print(myarray[c]+" ");
		}
		s.close();
	}

}
