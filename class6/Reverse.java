package class6;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i =0 ;i<n; i++) {
			arr[i] = s.nextInt(); 
		}
		for(int j=0 ; j<n/2 ; j++) {
			int temp = arr[j];
		    arr[j] = arr[n-1-j];
		    arr[n-1-j] = temp;
		}
		for(int k =0;k<n;k++) {
			System.out.print(arr[k]);
		}
		s.close();
	}
	

}
