package DStructureBook;
import java.util.Scanner;
public class DStructureBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),p = sc.nextInt(),k = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int count = 0;
		if (p==k||p==N) {
			System.out.println("-0");
			sc.close();
			return;
		}
		else if(p==1) {
			System.out.println(0);
			sc.close();
			return;
		}
		else if(p < N&&p >0){
		for(int i=1;i<=N;i++) {
			count++;
			if(i==1&&i==p) {
				break;
			}
			else if(i==p||i+1==p) {
				break;
			}
		}
		if(count < min) min = count;
		if(k==N)count = 0;
		else count = 1;
		for(int i=N;i>0;i--) {
			if(i==N&&i==p) {
				break;
			}
			else if((i==p||i-1==p)&&i!=N) {
				break;
			}
			count++;
		}
		if(count < min) min = count;
		count = 0;
		for(int i=k;i<=N&&k!=1;i+=2) {
			
			if((i==p||i+1==p)&&i!=k&&i%2==0) {
				break;
			}
			else if((i==p||i+1==p)&&i==k&&i%2==0) {
				break;
			}
			count++;
		}
		if(count < min) min = count;
		count = 0;
		for(int i=k;i>0&&i!=1;i--) {
			if((i==p||i-1==p)&&i!=k&&i%2==1) {
				break;
			}
			else if((i==p||i-1==p)&&i==k&&i%2==1) {
				break;
			}
			count++;
		}
		if(count < min) min = count;
		if(N%2==1) {
			count=0;
			for(int i=N;i>=0;i--) {
				if(i==N&&i==p) {
					break;
				}
				else if(i==p||i-1==p) {
					break;
				}
				count++;
			}
			if(count < min) min = count;
		}
	}
				else if(p > N){
					int diff = N-p;
					if(diff < min) min = diff;
				}
				else if(p <= 0) {
					int diff = -p;
					if(diff < min) min = diff;
				}
				
		System.out.println(min);
		sc.close();
	}

}
