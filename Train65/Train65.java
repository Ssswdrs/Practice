package Train65;
import java.util.Scanner;
public class Train65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int b1 = 0,b2 = 0,minDiff=Integer.MAX_VALUE,pos=0;
		for(int i = 1;i < n-1;i++) {
			int diff=0;
			b1 = 0;
			b2 = 0;
			for(int j=i-1;j>=0;j--) {
				b1+=arr[j];
			}
			for(int k=i;k<n;k++) {
				b2+=arr[k];
			}
			if(b1>=b2) {
				diff = b1 - b2;
			}
			else {
				diff = b2 - b1;
			}
			System.out.println(b1+" " +b2);
			if(diff < minDiff) {
				minDiff = diff;
				pos = i+1;
			}
		}
		System.out.println(pos+" "+minDiff);
		
		sc.close();
	}
}
