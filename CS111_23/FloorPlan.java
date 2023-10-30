package CS111_23;
import java.util.Scanner;
public class FloorPlan {
	private char[][] plan;
	private int posX;
	private int posY;
	public FloorPlan(int sizeX, int sizeY, int x, int y) {
		Scanner scan = new Scanner(System.in);
		if(sizeX > 0 && sizeY > 0) {
			plan = new char[sizeY][sizeX];
		}
		if(isValid(x,y)) {
			posX = x;
			posY = plan.length - y - 1;
		} else {
			while(!(isValid(x,y))) {
				System.out.println("Invalid move ("+ x +","+ y +"). Not moving!!");
				System.out.println("Please input correct (x,y) position.");
				System.out.print("x : ");
				x = scan.nextInt();
				System.out.print("y : ");
				y = scan.nextInt();
			}
			posX = x;
			posY = plan.length - y - 1;
		}
		for(int i = 0; i < sizeY; i++) {
			for(int j = 0; j < sizeX; j++) {
				if(j == posX && i == posY) {
					plan[i][j] = 'I';
				} else 	plan[i][j] = '.';
			}
		}
		scan.close();
	}
	public char[][] getPlan(){
		return plan;
	}
	public boolean isValid(int x, int y) {
		if(x < plan[0].length && x >= 0 && y >= 0 && y < plan.length) {
			return true;
		}
		return false;
	}
	public void moveTo(int x, int y) {
		if(isValid(x,y)) {
			plan[posY][posX] = '.';
			posX = x;
			posY = plan.length - y - 1;
			plan[posY][posX] = 'I';
			System.out.println("Moving to ("+ x +", " + y +")");
		} else System.out.println("Invalid move ("+ x +", "+ y +"). Not moving!!");
	}
	public void reportBotPosition() {
		System.out.println("IRobot current position ("+ posX +", "+ (plan.length-posY-1) +")");
	}
}
