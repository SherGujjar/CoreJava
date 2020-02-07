package class5;
import java.util.*;

public class UpperToLower {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char ch = s.nextLine().charAt(0);
		int i;
		if(ch>='A' && ch<='Z') {
			 i = ch +32;
			System.out.println((char)i);
		}
		else if (ch>='a' && ch<='z') {
			i= ch - 32;
			System.out.println((char)i);
		}
		s.close();
	}

}
