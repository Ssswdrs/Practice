package CircularArrayRotation;
import java.util.Scanner;
public class CircularArrayRotation {
	
	public static void rotate(int[] a) {
		int temp = a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i] = a[i-1];
		}
		a[0] = temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),k = sc.nextInt(),s = sc.nextInt();
		int[] m = new int[k],a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<k;i++) {
			m[i] = sc.nextInt();
		}
		for(int i=0;i<k;i++) {
			rotate(a);
			int pos = (s+m[i])%n;
			System.out.println(a[pos]);
		}
		sc.close();
	}

}
