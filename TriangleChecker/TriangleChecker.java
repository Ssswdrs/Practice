package TriangleChecker;
import java.util.Scanner;
public class TriangleChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a > b + c||b > a+c||c>b+a) {
			System.out.println(0);
			System.out.println(0);
		}
		else if(a == b && b == c && c ==a) {
			System.out.println(1);
			System.out.println(a);
		}
		else if(((a == b) && a != c&&b != c)||((c == b) && a != c&&a != b)||((a == c) && b != c&&b != a)) {
			int max =a;
			if(max < b) max = b;
			else if(max < c) max = c;
			System.out.println(2);
			System.out.println(max);
		}
		else if(a != b && b!=c && a != c) {
			int max =a;
			if(max < b) max = b;
			else if(max < c) max = c;
			System.out.println(3);
			System.out.println(max);
		}
		sc.close();
	}

}
