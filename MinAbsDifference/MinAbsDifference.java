package MinAbsDifference;
import java.util.Scanner;
public class MinAbsDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int min = 202, diff = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]!=arr[j]) {
					diff = Math.abs(arr[i]-arr[j]);
					if(min > diff) {
						min = diff;
					}
				}
			}
		}
		System.out.println(min);
		sc.close();
	}

}
