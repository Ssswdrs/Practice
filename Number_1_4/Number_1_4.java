package Number_1_4;
import java.util.Scanner;
public class Number_1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] ans = new int[2];
		int n = i,count = 0;
		while(true){
			i = n;
			n = 0;
			for(int j = 0;j<String.valueOf(i).length();j++) {
				n += Math.pow(Character.getNumericValue(String.valueOf(i).charAt(j)),2);
			}
			count++;
			if(n == 1 || n == 4 || i == 1 || i == 4) break; 
		}
		ans[0] = n;
		ans[1] = count;
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		sc.close();
	}

}
