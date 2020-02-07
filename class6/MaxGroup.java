package class6;
import java.util.*;

public class MaxGroup {

	public static void main(String[] args) {
		System.out.println("Enter the length of array");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		System.out.println("Enter the Array Elements");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = s.nextInt();
		}
		for(int j = 0 ; j < n ; j++) {
			
			if(arr[j]>0) {
				sum +=arr[j];
			}
		}
		System.out.println("The largest sum of sub array is"+sum);
		s.close();
	}

}
