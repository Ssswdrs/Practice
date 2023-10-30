package SSTF;
import java.util.Scanner;
import java.util.ArrayList;
public class SSTF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		int min, minIndex=0,sum=0;
		while(!al.isEmpty()) {
			min = Integer.MAX_VALUE;
			for(int i=0;i<al.size();i++) {
				if(Math.abs(start-al.get(i))<min) {
					min = Math.abs(start-al.get(i));
					minIndex = i;
				}
			}
			sum+=min;
			start = al.get(minIndex);
			al.remove(minIndex);
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
