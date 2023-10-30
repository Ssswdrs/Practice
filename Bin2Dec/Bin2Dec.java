package Bin2Dec;
import java.util.Scanner;
public class Bin2Dec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0, n = sc.nextInt(), temp;
		double pow = Math.pow(2.0, n-1);
		for(int i=0;i<n;i++) {
			temp = sc.nextInt();
			ans += (int)(temp*pow);
			pow /= 2;
		}
		System.out.println(ans);
		sc.close();
	}

}
