package MatrixRotation65;
import java.util.Scanner;
public class MatrixRotation65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[][] mat = new int[2][m];
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<2;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int temp = 0;
		for(int i = 0;i<n;i++) {
			temp = mat[0][0];
			for(int j=1;j<m;j++) {
				mat[0][j-1] = mat[0][j];
			}
			mat[0][m-1]=mat[1][m-1];
			for(int j=m-1;j>0;j--) {
				mat[1][j] = mat[1][j-1];
			}
			mat[1][0] = temp;
		}
		
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		

		sc.close();
	}
}
