package comptitive;
import java.util.*;
public class TigerAndBolt {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i<n;i++) {
			double finish = s.nextInt();
			double distancebolt = s.nextInt();
			double a = s.nextInt();
			double boltspeed = s.nextInt();
			double t1 = bolt(finish , boltspeed );
			double t2 = tiger((finish+distancebolt),a);
			if(t1>t2) {
				System.out.println("Tiger");
			}
			else {
				System.out.println("Bolt");
			}
			
			
		}
		s.close();
	}

	private static double tiger(double i, double a) {
		double t = Math.sqrt((2*i)/a);
		return (t);
	}

	private static double bolt(double finish, double boltspeed) {
		double t = finish/boltspeed;
		return(t);
	}


}
