package ActivitySelection;
import java.util.Scanner;

public class ActivitySelectionTest {

	public static class subject {
		public int start = 0;
		public int end = 0;
	}

		public int act(subject[] a) {
			int cnt=1, size = a.length;
			subject[] tmp = new subject[1];
			for(int i=0;i<size-1;i++) {
				for(int j=i+1;j<size;j++) {
					if(a[i].end > a[j].end) {
						tmp[0] = a[i];
						a[i] = a[j];
						a[j] = tmp[0];
					}
				}
			}
			int j=0;
			for(int i=1;i<size;i++) {
				if(a[j].end <= a[i].start) {
					cnt++;
					j = i;
				}
			}
			return cnt;
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sub = sc.nextInt();
		sc.nextLine();
		subject[] sb = new subject[sub];
		for(int i=0;i<sub;i++) {
			sb[i] = new subject();
			sb[i].start = sc.nextInt();
			sb[i].end = sc.nextInt();
			sc.nextLine();
		}
		ActivitySelectionTest as = new ActivitySelectionTest();
		int ans = as.act(sb);
		System.out.println(ans);
		for(int i=0;i<sub;i++) {
			System.out.println(sb[i].start+ " "+sb[i].end);
		}
		sc.close();
	}

}
