package CoronaVirus;
import java.util.Scanner;
public class CoronaVirus {

	public static int stack(int n,int r0,int k,int s) {
		if(k == 0)return s;
		k--;
		n /= 2;
		s += n;
		n *= r0;
		return stack(n,r0,k,s);
	}
	
	public static int infected(int n,int r0,int k,int s) {
		if(k == 0)return s;
		s += n;
		k--;
		n /= 2;
		n *= r0;
		return infected(n,r0,k,s);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ,r0 = sc.nextInt() ,k = sc.nextInt();
		System.out.println(infected(n,r0,k,0) + "\n" + stack(n,r0,k,0));
		sc.close();
	}

}
