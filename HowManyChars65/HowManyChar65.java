package HowManyChars65;
import java.util.Scanner;
public class HowManyChar65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int n = sc.nextInt();
		int[] ans = new int[n];
		sc.nextLine();
		String s = null;
		for(int i = 0;i<n;i++) {
			int cnt=0;
			s = sc.nextLine();
			for(int j = 0; j < s.length();j++) {
				if(a.equals(String.valueOf(s.charAt(j)))) {
					cnt++;
				}
			}
			ans[i] = cnt;
		}
		for(int A : ans) {
			System.out.println(A);
		}
		sc.close();
	}
}
