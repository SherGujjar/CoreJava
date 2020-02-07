package class6;
import java.util.*;

public class SumSubArray {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int[] arr = {1,2,-8,13,2,-1,3,2,1};
		int sum = subarr(arr);
		System.out.println(sum);
		s.close();

	}

	private static int subarr(int[] arr) {
		int i = 0;
		int csum=arr[0];
		int osum=arr[0];
		while(i<arr.length) {
			if(csum>0) {
				csum= csum + arr[i];
			}
			else {
				csum=arr[i];
			}
			if(csum>osum) {
				osum = csum;
			}
			i++;
		}
		return osum ;
	}

}
