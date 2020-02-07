package class3;
import java.util.*;

public class binarySysytem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		manu();
		int choice = s.nextInt();
		int n = s.nextInt();
		switch(choice) {
		case 1 :
			int bd = binaryToDecimal(n);
			 System.out.println(bd);
			break;
		
		case 2 :
			int bo =binaryToOcatal(n);
			System.out.println(bo);
			break;
			
			
		case 3 :
			int bh = binaryToHexaDecimal(n);
			System.out.println(bh);
			break;
			
		case 4 : 
			int db = DecimalToBinary(n);
			System.out.println(db);
			break;
			
		case 5 :
			int dto = DecimalTooctal(n);
			System.out.println(dto);
			break;
			
			
		case 6 :
			int dh = DecimalToHexaDecimal(n);
			System.out.println(dh);
			break;
			
			
		case 7 :
			OcatalToBinary(n);
			break;
			
			
		case 8 :
			OcatalToDecimal(n);
			break;
			
			
		case 9 :
			OctalToHexaDecimal(n);
			break;
			
			
		case 10 :
			HexaDecimalToBinary(n);
			break;
			
			
		case 11 :
			HexaDecimalToDecimal(n);
			break;
			
			
		case 12 :
			HexaDecimalToOctal(n); 
			break;
			
		default:
			System.out.println("Invalid input");
			
		}

	}


private static void HexaDecimalToOctal(int a) {
		// TODO Auto-generated method stub
		
	}


private static void HexaDecimalToDecimal(int a) {
		// TODO Auto-generated method stub
		
	}


private static void HexaDecimalToBinary(int a) {
		// TODO Auto-generated method stub
		
	}


private static void OctalToHexaDecimal(int a) {
		// TODO Auto-generated method stub
		
	}


private static void OcatalToDecimal(int a) {
		
		
	}


private static void OcatalToBinary(int a) {
		
		
	}


private static int DecimalToHexaDecimal(int a) {
		int ans = 0;
		int pow= 1;
		while(a > 0) {
			int rem = a % 16;
			int ch[] = {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','f'};
				ans = ans + ch[rem]*pow;
				pow = pow *10;
				a = a / 16; 
			}
		return (ans);
		}
		
private static int DecimalTooctal(int a) {
		int ans = 0;
		int pow= 1;
		while(a > 0) {
			int rem = a % 8;
			ans = ans + rem*pow;
			pow = pow*10;
			a = a/8;
		}
		return(ans);
	}


private static int DecimalToBinary(int a) {
		int ans = 0;
		int pow = 1;
		while(a > 0) {
			int rem = a % 2;
			ans = ans + rem*pow;
			pow = pow*10;
			a = a / 2;
		}
		return(ans);
	}


private static int binaryToHexaDecimal(int a) {
		int ans = 0;
		int pow = 1;
		while(a > 0) {
			int rem = a % 10000;
			ans = ans +binaryToDecimal(rem)*pow;
			pow = pow*10;
			a = a / 10000;
		}
		return(ans);
	}


private static int binaryToOcatal(int a) {
		int ans = 0;
		int pow = 1;
		while(a > 0) {
			int rem = a % 1000;
			ans = ans + binaryToDecimal(rem)*pow;
			pow = pow*10;
			a = a / 1000; 
		}
		return(ans);
		
	}


private static int binaryToDecimal(int a) {
	int ans = 0;
	int pow = 1;
	while(a > 0) {
		int rem = a % 10;
		ans = ans + pow*rem;
		pow = pow*2;
		a = a / 10;
	}
	return(ans);
		
		
	}


public static void manu() {
	System.out.println("choice1=Binary to decimal");
	System.out.println("choice2=Binary to octal");
	System.out.println("choice3=Binary to hexadecimal");
	System.out.println("choice4=Decimal to binary");
	System.out.println("choice5= Decimal to ocatl");
	System.out.println("choice6= Decimal to HexaDecimal");
	System.out.println("choice7= Octal to Binary");
	System.out.println("choice8 = Octal to Decimal");
	System.out.println("choice9 = Octal to HexaDecimal");
	System.out.println("choice10 = HexaDecimal to Binary");
	System.out.println("choice11 = HexaDecimal to Decimal");
	System.out.println("choice12 = HexaDecimal to Octal");
}
	
}
