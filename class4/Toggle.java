package class4;

import java.util.*;

public class Toggle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = n;
		int i = 0;
		while(k>0) { 
			int mask = 1;
			mask = mask<<i;
				n = n ^ mask;
				i++;
				k=k/2;
		}
		System.out.println(n);
		s.close();
	}

}
