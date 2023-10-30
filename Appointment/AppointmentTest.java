package Appointment;
import java.util.Scanner;
public class AppointmentTest {

	public static class person {
		public int stimeh = 0 , stimem = 0, jtimeh = 0 , jtimem = 0;
	}

	public person app(person a,person b) {
		person p = new person();
		if((a.stimeh > b.stimeh || (a.stimeh == b.stimeh && a.stimem <= b.stimem))&& (a.stimeh < b.jtimeh||(a.stimeh == b.jtimeh && a.stimem <= b.jtimem))) {
			p.stimeh = a.stimeh;
			p.stimem = a.stimem;
			if((a.jtimeh < b.jtimeh || (a.jtimeh == b.jtimeh && a.jtimem <= b.jtimem))&& (a.jtimeh> b.stimeh||(a.jtimeh == b.stimeh && a.jtimem >= b.stimem))) {
				p.jtimeh = a.jtimeh;
				p.jtimem = a.jtimem;
			}else if((b.jtimeh < a.jtimeh || (b.jtimeh == a.jtimeh && b.jtimem <= a.jtimem))&& (b.jtimeh> a.stimeh||(b.jtimeh == a.stimeh && b.jtimem >= a.stimem))) {
				p.jtimeh = b.jtimeh;
				p.jtimem = b.jtimem;
			}
		}else if((b.stimeh > a.stimeh || (b.stimeh == a.stimeh && b.stimem <= a.stimem))&& (b.stimeh < a.jtimeh||(b.stimeh == a.jtimeh && b.stimem <= a.jtimem))) {
			p.stimeh = b.stimeh;
			p.stimem = b.stimem;
			if((a.jtimeh < b.jtimeh || (a.jtimeh == b.jtimeh && a.jtimem <= b.jtimem))&& (a.jtimeh> b.stimeh||(a.jtimeh == b.stimeh && a.jtimem >= b.stimem))) {
				p.jtimeh = a.jtimeh;
				p.jtimem = a.jtimem;
			}else if((b.jtimeh < a.jtimeh || (b.jtimeh == a.jtimeh && b.jtimem <= a.jtimem))&& (b.jtimeh> a.stimeh||(b.jtimeh == a.stimeh && b.jtimem >= a.stimem))) {
				p.jtimeh = b.jtimeh;
				p.jtimem = b.jtimem;
			}
		}
		return p;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		person p1 = new person();
		person p2 = new person();
		p1.stimeh = sc.nextInt();
		p1.stimem = sc.nextInt();
		p1.jtimeh = sc.nextInt();
		p1.jtimem = sc.nextInt();
		sc.nextLine();
		p2.stimeh = sc.nextInt();
		p2.stimem = sc.nextInt();
		p2.jtimeh = sc.nextInt();
		p2.jtimem = sc.nextInt();
		AppointmentTest am = new AppointmentTest();
		person p = am.app(p1,p2);
		System.out.println(p.stimeh+" "+p.stimem+" "+p.jtimeh+" "+p.jtimem);
		sc.close();
	}

}
