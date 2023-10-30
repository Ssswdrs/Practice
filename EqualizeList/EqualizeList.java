package EqualizeList;
import java.util.Scanner;
public class EqualizeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		int k = 0,fnum = 0,cnt = 0, remain = 0,min = 1001;
		while(k<n) {
			fnum = num[k];
			for(int i=0;i<n;i++) {
				if(fnum != num[i]) {
					cnt++;
				}
			}
			if(min > cnt) {
				min = cnt;
				remain = fnum;
			}
			k++;
			cnt = 0;
		}
		System.out.println(remain);
		for(int i=0;i<n;i++) {
			if(num[i]!=remain) {
				System.out.println(num[i]);
			}
		}
		sc.close();
	}

}
