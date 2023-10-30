package Key;
import java.util.Scanner;
public class Key {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt(), ed = sc.nextInt(),cnt,second=0,p=0,q=0,nspe= 0;
		for(int i=st;i<=ed;i++) {
			cnt = 0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(i != st) {
				if(cnt == 0&&second==0) {
					second++;
					nspe++;
				}
				else if(cnt == 0&& second==1) {
					p = i;
					second++;
					nspe++;
				}
				else if(cnt == 0) {
					nspe++;
					q = i; 
				}
			}
			
		}
		System.out.println(p*q);
		System.out.println(nspe);
		sc.close();
	}
	
}
