package CS111_23;

public class GridShow {
	public static void show(char[][] grid) {
		System.out.println("  Floor Plan size (x,y) = ("+ grid[0].length+", "+ grid.length+")");
		int cntX = grid.length-1, cntY = grid[0].length;
		for(int x=0;x<grid.length;x++) {
			System.out.print(cntX--);
			for(int y=0;y<grid[0].length;y++) {
				System.out.print(" " + grid[x][y]);
			}
			System.out.println();
		}
		System.out.print(" ");
		for(int i=0;i<cntY;i++) {
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.println();
	}
}
