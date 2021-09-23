import java.awt.*;

public class Painter extends Canvas{
	
	public final static int PIXELS = 30;
	int pacAnimation = 0; // Determines how large the arc of pacman is
	int pacArcBase = 15; // Degrees of pacman's gaping maw
	boolean increasing = true; // If pacMaw is increasing or decreasing in size
	public PacMan pac = new PacMan();
	int adjustDotPlacement = PIXELS / 2 - PIXELS / 10;
	int dotSize = PIXELS / 5;

	public void paint(Graphics g) {
		//super.paint(g);
		setBackground(Color.BLUE);
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		for (int y = 0; y < Grid.getGridLengthY(); y++)
		{
			for (int x = 0; x < Grid.getGridLengthX(); x++)
			{
				int curGrid = Grid.getGrid(x, y);
				if (curGrid == -1)
					continue;
				else if (curGrid >= 0)
					g.setColor(Color.BLACK);
				else
					g.setColor(Color.MAGENTA);
				g.fillRect(x * PIXELS, y * PIXELS, PIXELS, PIXELS);
				if (curGrid == 1)
				{
					g.setColor(Color.WHITE);
	
					g.fillRect((x * PIXELS) + adjustDotPlacement, (y * PIXELS) + adjustDotPlacement, dotSize, dotSize);
				}
			}
		}
		g.setColor(Color.YELLOW);
		g.fillOval((int)(pac.getX() * PIXELS), (int)(pac.getY() * PIXELS), PIXELS, PIXELS);
		g.setColor(Color.BLACK);
		g.fillArc((int)(pac.getX() * PIXELS), (int)(pac.getY() * PIXELS), PIXELS + 4, PIXELS + 4, 
				pac.getDir() * 90 - ((pacAnimation * pacArcBase) / 2), pacAnimation * pacArcBase);
		if (increasing)
			if (pacAnimation < 5)
				pacAnimation++;
			else
				increasing = false;
		else if (!increasing)
			if (pacAnimation > 0)
				pacAnimation--;
			else
				increasing = true;
	}
	
	public void update(Graphics g)
	{
		paint(g);
	}
}
