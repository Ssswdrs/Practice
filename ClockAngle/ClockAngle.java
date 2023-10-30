package ClockAngle;

import java.util.Scanner;

public class ClockAngle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt(),h2 = sc.nextInt(),m1 = sc.nextInt(),m2 = sc.nextInt();
		int h = (h1*10)+h2, m = (m1*10)+m2, diff=0;
		int cm = m / 5;
		if(cm == 0) cm = 12;
		if(Math.abs(h-cm)==6) {
			System.out.println(180);
		}
		else if(Math.abs(h-cm)>6) {
			if(h>cm) {
				diff = cm + Math.abs(h-12);
				System.out.println(diff*30);
			}else if(h<cm) {
				diff = h + Math.abs(cm-12);
				System.out.println(diff*30);
			}
		}else {
			System.out.println(Math.abs(h-cm)*30);
		}
		sc.close();
	}

}
