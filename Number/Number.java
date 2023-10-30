package Number;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		for(int i=0;i<N;i++) {
			ar.add(sc.nextInt());
		}
		for(int i=0;i<M;i++) {
			String Action = sc.next();
			if(Action.equals("q")) {
				int x = sc.nextInt();
				sc.nextLine();
				ans.add(ar.get(x-1));
			}else if(Action.equals("a")){
				int x = sc.nextInt();
				int y = sc.nextInt();
				sc.nextLine();
				Collections.swap(ar, x-1, y-1);
			}else if(Action.equals("b")){
				int x = sc.nextInt();
				int y = sc.nextInt();
				sc.nextLine();
				ar.set(x-1, y);
			}else if(Action.equals("c")){
				int x = sc.nextInt();
				Collections.reverse(ar.subList(0, x));
				Collections.reverse(ar.subList(x, N));
			}
		}
		for(Integer a : ans) {
			System.out.println(a);
		}
		sc.close();
	}
}
