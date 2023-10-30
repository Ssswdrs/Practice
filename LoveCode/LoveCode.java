package LoveCode;
import java.util.Scanner;//******
public class LoveCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] memrow = new int[n],memcol = new int[m];
		int[][] table = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				table[i][j] = sc.nextInt();
			}
		}
		int mem = 0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				memcol[mem] += table[j][i]; 
			}
			mem++;
		}
		mem = 0; 
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				memrow[mem] += table[i][j]; 
			}
			mem++;
		}
		for(int i=0;i<n;i++) {
			if(memrow[i]%2!=0) {
				System.out.println(i);
			}
		}
		for(int i=0;i<m;i++) {
			if(memcol[i]%2!=0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
