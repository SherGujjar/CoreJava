package comptitive;
import java.util.*;

public class TurboSort {

	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int[] arr = new int[n];
	    for(int i =0 ; i<n ; i++){
	        arr[i]=s.nextInt();
	    }
	    for(int j =0 ; j<n ; j++){
	        for(int k = 0 ; k<n-1 ;k++){
	            if(arr[k]>arr[k+1]){
	                int temp = arr[k];
	                arr[k]=arr[k+1];
	                arr[k+1]=temp;
	            }
	        }
	    }
	    for(int c =0 ; c<n ; c++){
	        System.out.println(arr[c]+" ");
	    }
	    s.close();
	}
}
	

