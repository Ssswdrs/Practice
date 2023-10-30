package SockMatching;
import java.util.Scanner;
public class SockMatching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),cnt = 0;
		int[] sock = new int[N];
		for(int i=0;i<N;i++) {
			sock[i] = sc.nextInt();
		}
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<N-i-1;j++) {
				if(sock[j] > sock[j+1]) {
					int temp = sock[j];
					sock[j] = sock[j+1];
					sock[j+1] = temp;
				}
			}
		}
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(sock[i] == sock[j]) {
					cnt++;
					i++;
					break;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
