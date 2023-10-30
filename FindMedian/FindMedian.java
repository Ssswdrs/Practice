package FindMedian;
import java.util.Scanner;//*******
public class FindMedian {
//interest
	public static void sort(int[] a) {
		int temp, l = a.length-1;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l-i;j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public static int Max(int[] a) {
		int max = a[0], l = a.length;
		for(int i=0;i<l;i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	public static int Min(int[] a) {
		int min = a[0], l = a.length;
		for(int i=0;i<l;i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		sort(num);
		double med = -1;
		int medi = -1,l = num.length;
		int l1,l2 = 0;
		if(l%2==0) {
			l1 = (num.length/2)-1;
			l2 = ((num.length+2)/2)-1;
			med = (num[l1]+num[l2])/2.0;
			medi = (int)med;
		}else {
			l1 = ((num.length+1)/2)-1;
			medi = num[l1];
		}
		System.out.println("Min="+Min(num));
		System.out.println("Max="+Max(num));
		if(num.length%2==0 && (med%1!=0)) {
			System.out.printf("Median=%.1f",med);
			System.out.println();
		}else System.out.println("Median="+medi);
		sc.close();
	}

}
