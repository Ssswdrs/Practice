package income;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.HashSet;

public class income {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		arr.sort(null);
		if(n%2!=0) {
			System.out.println(arr.get(n/2));
		}
		else {
			System.out.println((int)Math.ceil((double)(arr.get(n/2)+arr.get((n/2)-1))/2));
		}
	}
}
