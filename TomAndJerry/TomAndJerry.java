package TomAndJerry;
import java.util.Scanner;//*******
public class TomAndJerry {

	public static boolean isTrap(String t) {
		return t.equalsIgnoreCase("1")?true:false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(), k = sc.nextInt(), jer = 0;
		sc.nextLine();
		String w = sc.nextLine();
		String[] way = w.split(""); 
		int size = i-1,pos = 0,mem=0,cj = 0,ck =0;
		String[] jerry = new String[size];
		while(true) {
			if(isTrap(way[pos])) {
				jer+=2;
				jerry[mem] = String.valueOf(jer);
				pos+=2;
			}else {
				jer++;
				jerry[mem] = String.valueOf(jer);
				pos++;
			}
			mem++;
			cj++;
			if(jer == i)break;
		}
		pos = 0;
		while(true) {
			k--;
			ck++;
			if(k == i)break;
		}
		if(ck == cj) {
			for(int j=0;j<mem;j++) {
				System.out.print(jerry[j]+" ");
			}
			System.out.println();
			System.out.println("-1");
		}
		else if(ck < cj) {
			for(int j=0;j<mem;j++) {
				System.out.print(jerry[j]+" ");
			}
			System.out.println();
			System.out.println("0");
		}
		else if(ck > cj) {
			for(int j=0;j<mem;j++) {
				System.out.print(jerry[j]+" ");
			}
			System.out.println();
			System.out.println("1");
		}
//		boolean swt = true;
//		while(swt) {
//			if(isTrap(way[pos])) {
//				jer+=2;
//				jerry[mem] = String.valueOf(jer);
//				pos+=2;
//			}else {
//				jer++;
//				jerry[mem] = String.valueOf(jer);
//				pos++;
//			}
//			k--;
//			mem++;
//			if(jer == i && k == i) {
//				for(int j=0;j<mem;j++) {
//					System.out.print(jerry[j]+" ");
//				}
//				System.out.println();
//				System.out.println("-1");
//				swt = false;
//			}
//			else if(jer < i && k == i) {
//				for(int j=0;j<mem;j++) {
//					System.out.print(jerry[j]+" ");
//				}
//				System.out.println();
//				System.out.println("0");
//				swt = false;
//			}
//			else if(jer == i && k > i) {
//				for(int j=0;j<mem;j++) {
//					System.out.print(jerry[j]+" ");
//				}
//				System.out.println();
//				System.out.println("1");
//				swt = false;
//			}
//		}
		sc.close();
	}

}
