import java.awt.*;

public class Painter extends Canvas{
	
	public final static int PIXELS = 30;

	public void paint(Graphics g) {
		for (int y = 0; y < Grid.getGridLengthY(); y++)
		{
			for (int x = 0; x < Grid.getGridLengthX(); x++)
			{
				int curGrid = Grid.getGrid(x, y);
				if (curGrid >= 0)
					g.setColor(Color.BLACK);
				else if (curGrid == -1)
					g.setColor(Color.BLUE);
				else
					g.setColor(Color.MAGENTA);
				g.fillRect(x * PIXELS, y * PIXELS, PIXELS, PIXELS);
				if (Grid.getGrid(x, y) == 1)
				{
					g.setColor(Color.WHITE);
					g.fillRect((x * PIXELS) + (PIXELS / 2) - (PIXELS / 10), (y * PIXELS) + (PIXELS / 2) - (PIXELS / 10), PIXELS / 5, PIXELS / 5); 
				}
			}
		}
	}
}
