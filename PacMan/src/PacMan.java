
public class PacMan extends Entity {

	private int dirStorage;
	
	public PacMan()
	{
		super.setX(13);
		super.setY(21);
		super.setDir(RIGHT);
		dirStorage = RIGHT;
	}
	
	public void setDir(int val)
	{
		dirStorage = val;
	}
	
	public void move()
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
		super.move();
	}
}
