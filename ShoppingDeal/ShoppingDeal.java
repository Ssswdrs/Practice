package ShoppingDeal;
import java.util.Scanner;
public class ShoppingDeal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] book = new int[5];
		int sum = 0;
		double result = 0.0;
		for(int i=0;i<5;i++) {
			book[i] = sc.nextInt();
		}
		do{
			sum = 0;
			for(int i=0;i<5;i++) {
				if(book[i] > 0) {
					sum++;
					book[i]--;
				}
			}
			switch(sum) {
				case 1 : result += 100; break;
				case 2 : result += 200*(95/100.0); break;
				case 3 : result += 300*(90/100.0); break;
				case 4 : result += 400*(80/100.0); break;
				case 5 : result += 500*(75/100.0); break;
			}
		}while(sum > 0); 
		
		
//		int book1 = sc.nextInt(),book2 = sc.nextInt(),book3 = sc.nextInt(),book4 = sc.nextInt(),book5 = sc.nextInt();
//		double result = 0.0;
//		int sum = 0;
//		while(book1 > 0 || book2 > 0 ||book3 > 0 || book4 > 0 || book5 > 0 ) {
//			sum = 0;
//			if(book1 > 0) {
//				sum++;
//				book1--;
//			}
//			if(book2 > 0) {
//				sum++;
//				book2--;
//			}
//			if(book3 > 0) {
//				sum++;
//				book3--;
//			}
//			if(book4 > 0) {
//				sum++;
//				book4--;
//			}
//			if(book5 > 0) {
//				sum++;
//				book5--;
//			}
//			switch(sum) {
//				case 1 : result += 100; break;
//				case 2 : result += 200*(95/100.0); break;
//				case 3 : result += 300*(90/100.0); break;
//				case 4 : result += 400*(80/100.0); break;
//				case 5 : result += 500*(75/100.0); break;
//			}
//		}
		System.out.printf("%.0f\n", result);
		sc.close();
	}

}
