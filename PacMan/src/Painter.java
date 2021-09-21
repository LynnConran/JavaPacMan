import java.awt.*;

public class Painter extends Canvas{
	
	private final static int PIXELS = 30;

	public void paint(Graphics g) {
		for (int y = 0; y < Grid.getGridLengthY(); y++)
		{
			for (int x = 0; x < Grid.getGridLengthX(); x++)
			{
				if (Grid.getGrid(x, y) >= 0)
					g.setColor(Color.BLACK);
				else
					g.setColor(Color.BLUE);
				g.fillRect(x * PIXELS, y * PIXELS, (x + 1)* PIXELS, (y + 1) * PIXELS);
			}
		}
	}
}
