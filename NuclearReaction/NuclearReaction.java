package NuclearReaction;
import java.util.Scanner;
public class NuclearReaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K =  sc.nextInt(), N = sc.nextInt(), A = sc.nextInt();
		int[] slot = new int[K];
		while(A>0) {
			slot[0]++;
			for(int j=1;j<K;j++) {
				if(slot[j-1]>N) {
					slot[j-1] = 0;
					slot[j] += 1;
				}
			}
			A--;
		}
		
		for(int a:slot) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}
