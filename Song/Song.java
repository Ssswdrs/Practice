package Song;
import java.util.Scanner;
public class Song {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] type = new int[6];
		int n = sc.nextInt(),temp;
		for(int i=0;i<n;i++) {
			sc.nextInt();
			temp = sc.nextInt();
			switch(temp) {
				case 1 : type[0]++; break;
				case 2 : type[1]++; break;
				case 3 : type[2]++; break;
				case 4 : type[3]++; break;
				case 5 : type[4]++; break;
				case 6 : type[5]++; break;
				default: ;
			}
		}
		int max = -1,secmax = -1,maxType = 0,secType = 0;
		for(int i=0;i<6;i++) {
			if(type[i]>max) {
				max = type[i];
				maxType = i+1;
			}
		}
		for(int j=0;j<6;j++) {
			if(j!=maxType-1 && type[j] > secmax) {
				secmax = type[j];
				secType = j+1;
			}
		}
		System.out.println(maxType);
		System.out.println(secType);
		sc.close();
	}

}
