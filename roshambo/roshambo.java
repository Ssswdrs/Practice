package roshambo;
import java.util.Scanner;//******
public class roshambo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),diff = 0,sum1=0,sum2=0;
		int[] p1 = new int[n],p2 = new int[n];
		for(int i=0;i<n;i++) {
			p1[i] = sc.nextInt();
			p2[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(p1[i] == p2[i]) ;
			else if(p1[i] == 0 && p2[i] == 2) {
				sum1++;
			}
			else if(p2[i] == 0 && p1[i] == 2) {
				sum2++;
			}
			else if(p1[i] == 1 && p2[i] == 0) {
				sum1++;
			}
			else if(p2[i] == 1 && p1[i] == 0) {
				sum2++;
			}
			else if(p1[i] == 2 && p2[i] == 1) {
				sum1++;
			}
			else if(p2[i] == 2 && p1[i] == 1) {
				sum2++;
			}
			
		}
		diff = sum1 - sum2;
		if(diff == 0) {
			System.out.println(0);
			System.out.println(0);
		}
		else if(diff < 0) {
			int temp = Math.abs(diff);
			System.out.println(2);
			System.out.println(temp*5);
		}
		else if(diff > 0) {
			System.out.println(1);
			System.out.println(diff*5);
		}
		sc.close();
	}

}
