package Chat;
import java.util.Scanner;
public class Chat {

	public static double distance(int x1,int y1,int x2,int y2) {
		return (Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n], y = new int[n], fid = new int[n];
		int xUser = 0, yUser = 0,r = 0;
		for(int i=0;i<n;i++) {
			fid[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		xUser = sc.nextInt(); yUser = sc.nextInt(); r = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(distance(x[i],y[i],xUser,yUser) <= r) {
				System.out.println(fid[i]+" "+1);
			}
			else {
				System.out.println(fid[i]+" "+0);
			}
		}
		sc.close();
	}

}
