
public class Grid {

	private static final int XLENGTH = 70;
	private static final int YLENGTH = 40;
	//private static int[][] grid = new int[YLENGTH][XLENGTH]; 
	private static int[][] grid = new int[][] 
		{ 
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, -1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, -1 },
			/*({ 0, -1, 0, 2, 2, -1, -1, -1 },
			{ -1, -1, 0, 2, 2, -1, -1, 0 },
			{ 0, -1, 0, 2, 2, -1, -1, 0 },
			{ -1, -1, 0, 2, 2, -1, -1, 0 },*/
		};
	// 0 for blank, 1 and up for consumables, -1 for walls, and -2 for that one ghost gate
	
	public static void setGrid(int x, int y, int change)
	{
		grid[y][x] = change;
	}
	
	public static int getGrid(int x, int y)
	{
		return grid[y][x];
	}
	
	public static int getGridLengthY()
	{
		return grid.length;
	}
	
	public static int getGridLengthX()
	{
		return grid[0].length;
	}
	
}
