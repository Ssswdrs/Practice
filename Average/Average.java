package Average;
import java.util.Arrays;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		double r = n * (30.0/100.0);
		double o = Math.round((r < 1)?1:r);
		n = (int)o;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		o = (double)sum/(double)n;
		n = (int)o;
		System.out.println(n);
		sc.close();
	}

}
