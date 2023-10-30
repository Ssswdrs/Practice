package NuggetNumbers;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class NuggetNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		int[] Nug = {6,9,20};
		int n = sc.nextInt();
		for(int i=6;i<=n;i+=6) {
			al.add(i);
		}
		for(int i=9;i<=n;i+=9) {
			al.add(i);
		}
		for(int i=20;i<=n;i+=20) {
			al.add(i);
		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(Integer a : al) {
			for(Integer b : al) {
				if(a+b<=n) temp.add(a+b);
			}
		}
		for(Integer a : temp) {
			al.add(a);
		}
		HashSet<Integer> h = new HashSet<Integer>(al);
//		ArrayList<Integer> a2 = new ArrayList<Integer>();
//		for(Integer a : al) {
//			int i2 = 0;
//			for(Integer b : a2) {
//				if(a==b) {
//					i2+=1;
//				}
//			}
//			if(i2==0)a2.add(a);
//		}
		al = new ArrayList<Integer>(h);
		al.sort(null);
		for(Integer a : al) {
			System.out.println(a);
		}
		sc.close();
	}

}
