package class6;
import java.util.*;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int[] myarr = new int[n];
		for(int i = 0 ; i<n ; i++) {
			myarr[i] = s.nextInt();
		}
		for(int j = 0 ; j < n-1 ; j++) {
			int min =j;
			for(int k = j+1 ; k < n ; k++) {
				if(myarr[min]>myarr[k]) {
					min = k;
				}
			}
			int temp = myarr[j];
			myarr[j]=myarr[min];
			myarr[min]=temp;
		}
		for(int c=0; c<n; c++) {
			System.out.print(myarr[c]+" ");
		}
		s.close();
	}

}
