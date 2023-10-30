package GoldCoin;
import java.util.Scanner;
public class GoldCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(),M = sc.nextInt(), D = sc.nextInt();
		int Q = sc.nextInt(), S = sc.nextInt();
		int[] road = new int[L];
		int[] park = new int[D];
		int pos = 0;
		for(int i=0;i<S;i++) {
			road[sc.nextInt()] = 21;
		}
		for(int i=0;i<Q;i++) {
			road[sc.nextInt()] = sc.nextInt();
		}
		for(int i=0;i<D;i++) {
			park[i] = sc.nextInt();
		}
		for(int i=0;i<D;i++) {
			pos += park[i];
			if(pos > L-1) {
				break;
			}
			if(road[pos] >= 1 && road[pos] <= 20) {
				M--;
				if(M <= 0)break;
				else M += road[pos];
			}
			else if(road[pos] == 21) {
				M--;
				if(M <= 0)break;
				else M *= 2;
			}
		}
		System.out.println(M);
		sc.close();
	}

}
