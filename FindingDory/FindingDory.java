package FindingDory;
import java.util.Scanner; //********
public class FindingDory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fish1 = sc.nextLine();
		String fish2 = sc.nextLine();
		String[] f1 = fish1.split(" ");
		String[] f2 = fish2.split(" ");
		String[] overlap = new String[f1.length];
		int cnt = -1, tempSize = 0;
		if(f1[f1.length-1].equals(f2[f2.length-1])) {
	firstLoop : for(int i=0;i<f1.length;i++) {
				  for(int j=0;j<f2.length;j++) {
					if(f1[i].equals(f2[j])) {
						if(f1.length-i == f2.length-j) {
							for(int k=0;k<f1.length-i;k++) {
								if(f1[i+k].equals(f2[j+k])) {
									cnt++;
									overlap[cnt] = f1[i+k];
									if(k>=f1.length-i-1) {
										tempSize = cnt+1;
										break firstLoop;
									}
								}
								else {
									cnt = -1;
									break;
								}
							}
						}
					}
				}
			}
		}
		else System.out.println(0);
		for(int i=0;i<tempSize;i++) {
			if(overlap[i]!=null)System.out.print(overlap[i]+" ");
		}
		System.out.println();
		sc.close();
	}

}
