package DiagonalDifference;
import java.util.Scanner;
public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		int sumLR = 0,sumRL = 0;
		for(int i=0;i<n;i++) {
			sumLR += matrix[i][i];
		}
		for(int i=0;i<n;i++) {
			sumRL += matrix[i][n-i-1];
		}
		int diff = sumLR - sumRL;
		int ans = (diff < 0)? -1*diff:diff;
		System.out.println(ans);
		sc.close();
	}

}
