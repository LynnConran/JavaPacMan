
public class Entity {

	private double x;
	private double y;
	private int dir;
	private double moveDistance = 0.15;
	
	
	final static double COLLISIONDISTANCE = 0.5;
	final static int RIGHT = 0;
	final static int UP = 1;
	final static int LEFT = 2;
	final static int DOWN = 3;
	
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void setX(double val)
	{
		x = val;
	}
	
	public void setY(double val)
	{
		y = val;
	}
	
	public int getDir()
	{
		return dir;
	}
	
	public void setDir(int val)
	{
		dir = val;
	}
	
	public void setDist(double val)
	{
		moveDistance = val;
	}
	
	public void moveCoordinates()
	{
		if (dir == RIGHT)
			x += moveDistance;
		else if (dir == UP)
			y -= moveDistance;
		else if (dir == LEFT)
			x -= moveDistance;
		else if (dir == DOWN)
			y += moveDistance;
	}
	
	public boolean checkCollision(Entity e)
	{
		if (Math.abs(e.getY() - y) <= COLLISIONDISTANCE && Math.abs(e.getX() - x) <= COLLISIONDISTANCE)
			return true;
		return false;
	}
	
	public void move()
	{
		if ((x % 1 > 0.9 || x % 1 < 0.1) && (y % 1 > 0.9 || y % 1 < 0.1))
		{
			if (dir == RIGHT && Grid.getGrid((int)Math.rint(x) + 1, (int)Math.rint(y)) >= 0)
			{
				moveCoordinates();
			}
			else if (dir == UP && Grid.getGrid((int)Math.rint(x), (int)Math.rint(y) - 1) >= 0)
			{
				moveCoordinates();
			}
			else if (dir == LEFT && Grid.getGrid((int)Math.rint(x) - 1, (int)Math.rint(y)) >= 0)
			{
				moveCoordinates();
			}
			else if (dir == DOWN && Grid.getGrid((int)Math.rint(x), (int)Math.rint(y) + 1) >= 0)
			{
				moveCoordinates();
			}
		}
		else
			moveCoordinates();
	}
}
