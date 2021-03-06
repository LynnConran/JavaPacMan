
public class PacMan extends Entity {

	private int dirStorage;
	
	public PacMan()
	{
		super.setX(13);
		super.setY(21);
		super.setDist(0.2);
		super.setDir(RIGHT);
		dirStorage = RIGHT;
	}
	
	public void setDir(int val)
	{
		dirStorage = val;
	}
	
	public void move()
	{
		if ((super.getX() % 1 > 0.9 || super.getX() % 1 < 0.1) && (super.getY() % 1 > 0.9 || super.getY() % 1 < 0.1))
		{
			if (dirStorage == UP)
			{
				if (Grid.getGrid((int)Math.rint(super.getX()), (int)Math.rint(super.getY()) - 1) >= 0)
					super.setDir(dirStorage);
			}
			if (dirStorage == LEFT)
			{
				if (Grid.getGrid((int)Math.rint(super.getX()) - 1, (int)Math.rint(super.getY())) >= 0)
					super.setDir(dirStorage);
			}
			if (dirStorage == DOWN)
			{
				if (Grid.getGrid((int)Math.rint(super.getX()), (int)Math.rint(super.getY()) + 1) >= 0)
					super.setDir(dirStorage);
			}
			if (dirStorage == RIGHT)
			{
				if (Grid.getGrid((int)Math.rint(super.getX()) + 1, (int)Math.rint(super.getY())) >= 0)
					super.setDir(dirStorage);
			}
		}
		chomp();
		super.move();
	}
	
	public void chomp()
	{
		if (Grid.getGrid((int)Math.rint(super.getX()), (int)Math.rint(super.getY())) > 0)
			Grid.setGrid((int)Math.rint(super.getX()), (int)Math.rint(super.getY()), 0);
	}
}
