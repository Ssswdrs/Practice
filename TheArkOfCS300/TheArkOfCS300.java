package TheArkOfCS300;
import java.util.Scanner;
public class TheArkOfCS300 {
		private static int x = 0;
		private static int y = 0;
		public static void setX(int a) {
			if(a < 20 && a >= 0)x = a;
		}
		public static void setY(int b) {
			if(b < 20 && b >= 0) y = b;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public void walk(int i) {
			switch(i) {
			case 1 : setX(x-1);
				break;
			case 2 : setY(y+1);
				break;
			case 3 : setX(x+1);
				break;
			case 4 : setY(y-1);
				break;
			}
		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] board = new int[20][20];
		for(int z = 0;z<20;z++) {
			for(int o = 0;o<20;o++) {
				board[z][o] = 0;
			}
		}
		TheArkOfCS300 ps = new TheArkOfCS300();
		//prize = 777;
		//person = 99;
		//bomb = 1;
		board[0][0] = 99;
		int x = sc.nextInt(),y = sc.nextInt();
		int q = x,w=y;
		board[x][y] = 777;
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			board[x][y] = 1;
		}
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			x = sc.nextInt();
			ps.walk(x);
			if(board[ps.getX()][ps.getY()]==1) {
				System.out.print(ps.getX()+" "+ps.getY()+"\n");
				System.out.println(0);
				return;
			}
		}
		System.out.print(ps.getX()+" "+ps.getY()+"\n");
		if((ps.getX() == q && ps.getY()==w)||(ps.getX() == q-1 && ps.getY()==w)||(ps.getX() == q+1 && ps.getY()==w)||(ps.getX() == q && ps.getY()==w-1)||(ps.getX() == q-1 && ps.getY()==w+1)) {
			System.out.println(1);
		}else System.out.println(0);
		
		sc.close();
	}

}
