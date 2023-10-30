package Histogram;
import java.util.Scanner;
public class Histogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		for(int i=0;i<20;i++) {
			arr[i] = sc.nextInt();
		}
		int cnt =0;
		for(int i=0;i<10;i++) {
			cnt=0;
			for(int j=0;j<20;j++) {
				if(arr[j]==i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
		sc.close();
	}

}
