package MagicSquare;
import java.util.Scanner;
public class MagicSquare {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] sq = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sq[i][j] = sc.nextInt();
			}
		}
		int[] mem = new int[(N*2)+2];
		int k = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				mem[k] += sq[i][j];
			}
			k++;
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				mem[k] += sq[j][i];
			}
			k++;
		}
		for(int i=0;i<N;i++) {
				mem[k] += sq[i][i];
		}
		k++;
		for(int i=0,j=N-1;(i<N && j>=0);i++,j--) {
				mem[k] += sq[i][j];
		}
		int max = mem[0];
		int temp = mem[0],cnt = 0;
		for(int i=0;i<(N*2)+2;i++) {
			if(max < mem[i]) {
				max = mem[i];
			}
			if(temp != mem[i]) {
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println( 9 + "\n" + max);
		}else {
			System.out.println( 0 + "\n" + max);
		}
		sc.close();
	}

}
