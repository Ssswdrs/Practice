package SnowMonster;
import java.util.Scanner;
public class SnowMonster {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),E = sc.nextInt();
		int[] hero = new int[N];
		for(int i=0;i<N;i++) {
			hero[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE, cnt = 0;
		for(int i=0;i<N;i+=2) {
			for(int j=1;j<N;j+=2) {
				if(hero[i]+hero[j] == E) {
					cnt++;
					if(max < i) {
						max = i;
					}
					if(max < j) {
						max = j;
					}
				}
			}
		}
		System.out.println(cnt);
		System.out.println(max+1);
		sc.close();
	}

}
