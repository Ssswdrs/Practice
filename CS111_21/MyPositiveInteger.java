package CS111_21;

public class MyPositiveInteger {
	private String val;
	public static String MAX = "99999999999999999999";
	public MyPositiveInteger(String initVal) {
		if(MAX.length() - initVal.length() >= 0) {
			val = initVal;
		} else {
			System.out.println("Invalid Parameter: Over Digit for Constructor");
			val = "0";
		}
	}
	public boolean isEven() {
		return Integer.parseInt(val) % 2 == 0 ? true:false;
	}
	public void prettyPrint() {
		int intVal = Integer.parseInt(val);
		int opt = val.length() % 3;
		if(intVal > 999 && intVal != 0) {
			if(opt == 0) {
				for(int i=0;i<val.length();i++) {
					System.out.print(val.charAt(i));
					if(i % 3 == 2 && i != 0 && i != val.length()-1)System.out.print(",");
				}
				System.out.println();
			}
			else if(opt == 1) {
				for(int i=0;i<val.length();i++) {
					System.out.print(val.charAt(i));
					if(i == 0)System.out.print(",");
					else if(i % 3 == 0 && i != 0 && i != val.length()-1)System.out.print(",");
				}
				System.out.println();
			}
			else if(opt == 2) {
				for(int i=0;i<val.length();i++) {
					System.out.print(val.charAt(i));
					if(i == 1)System.out.print(",");
					else if(i % 3 == 1 && i != 0 && i != val.length()-1)System.out.print(",");
				}
				System.out.println();
			}
		} else System.out.println(val);
	}
}
