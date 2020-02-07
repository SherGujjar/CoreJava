package class6;
import java.util.*;

public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int[] myarr = new int[n];
		for(int i = 0 ; i<n ; i++) {
			myarr[i]=s.nextInt();
		}
		for(int j = 0 ; j<n ; j++) {
			for(int k = 0 ; k<n-1 ; k++) {
				if(myarr[k]>myarr[k+1]) {
					int temp = 0;
					temp = myarr[k];
					myarr[k]=myarr[k+1];
					myarr[k+1]=temp;
				}
			}
		}
		for(int c= 0 ; c<n ; c++ ){
			System.out.print(myarr[c]+" ");
		}
		s.close();
	}

}
