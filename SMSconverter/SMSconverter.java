package SMSconverter;
import java.util.Scanner;
public class SMSconverter {
	
	public static String conv(String a) {
		if(a.equals("0")) return " ";
		char c = 'A',temp = ' ';
		for(int i=2;i<=8;i++) {
			String comp = "";
			if(i!=2) c = temp;
			if(i!=7) {
				for(int j=0;j<3;j++) {
					comp += String.valueOf(i);
					if(j!=0) c = temp;
					else temp = c;
					c = (char)(c+j);
					if(a.equals(comp)) {
						return String.valueOf(c);
					}
				}
				temp = (char)(c+1);
				comp = "";
			}
			else {
				c = 'T';
			}
		}
		c = 'P';
		for(int i=7;i<=9;i++) {
			String comp = "";
			if(i!=8) {
				for(int j=0;j<4;j++) {
					comp += String.valueOf(i);
					if(j!=0) c = temp;
					else temp = c;
					c = (char)(c+j);
					if(a.equals(comp)) {
						return String.valueOf(c);
					}
				}
				temp = (char)(c+1);
				comp = "";
			}
			else {
				c = 'W';
			}
		}
		return "Error";
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(), result = "";
		String[] in = input.split("1");
		for(String a : in) {
			result += conv(a);
		}
		System.out.println(result);
		sc.close();
	}

}
