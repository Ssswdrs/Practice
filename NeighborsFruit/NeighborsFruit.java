package NeighborsFruit;
import java.util.Scanner;
public class NeighborsFruit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int area_hl = sc.nextInt(),area_hr = sc.nextInt();
		int pTreeL = sc.nextInt(), pTreeR = sc.nextInt();
		int nTreeL = sc.nextInt(), nTreeR = sc.nextInt();
		int temp, lDrop = 0,rDrop = 0;
		//tree left
		for(int i=0;i<nTreeL;i++) {
			temp = sc.nextInt();
			if(pTreeL+temp >= area_hl && pTreeL+temp <= area_hr) {
				lDrop++;
			}
		}
		//tree right
		for(int i=0;i<nTreeR;i++) {
			temp = sc.nextInt();
			if(pTreeR+temp >= area_hl && pTreeR+temp <= area_hr) {
				rDrop++;
			}
		}
		System.out.println(lDrop + "\n" + rDrop);
		sc.close();
	}

}
