package BitBase58;
import java.util.Scanner;//***********
public class BitBase58 {
//interest
	public static boolean isBase(String a) {
		if(a.charAt(0)!='O' && a.charAt(0)!='I' && a.charAt(0)!='l') {
			if(a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') {
				return true;
			}
			else if(a.charAt(0) >= 'a' && a.charAt(0) <= 'z') {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isBasedi(char a) {
		int n = Character.getNumericValue(a);
		if(n >= 1 && n <= 9) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String address;
		int length;
		do {
			address = sc.nextLine();
			length = address.length();
		}while(length <1 || length > 60);
		int base58 = 0,diff = 0;
		String temp;
		for(int i=0;i<length;i++) {
			temp = String.valueOf(address.charAt(i));
			if(isBase(temp)) {
				if(temp.equals(temp.toUpperCase())) {
					diff = (int)(address.charAt(i)) - (int)('A');
					if(temp.charAt(0)>'O')diff--;
					if(temp.charAt(0)>'I')diff--;
					base58 += 9 + diff;
				}
				if(temp.equals(temp.toLowerCase())) {
					diff = (int)(address.charAt(i)) - (int)('a');
					if(temp.charAt(0)>'l')diff--;
					base58 += 33 + diff;
				}
			}
			else if(isBasedi(address.charAt(i))) {
				base58 += Integer.valueOf(temp)-1;
			}
			else {
				base58--; 
			}
		}
		System.out.println(base58);
		sc.close();
	}

}
