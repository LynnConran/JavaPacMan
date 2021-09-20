
public class Entity {

	private double x;
	private double y;
	
	final static double MOVEDISTANCE = 0.1;
	final static double COLLISIONDISTANCE = 0.5;
	final static int RIGHT = 0;
	final static int UP = 1;
	final static int LEFT = 2;
	final static int DOWN = 3;
	private int dir;
	
	public double get_x()
	{
		return x;
	}
	
	public double get_y()
	{
		return y;
	}
	
	public void move()
	{
		if (dir == RIGHT)
			x += MOVEDISTANCE;
		else if (dir == UP)
			y -= MOVEDISTANCE;
		else if (dir == LEFT)
			x -= MOVEDISTANCE;
		else if (dir == DOWN)
			y += MOVEDISTANCE;
	}
	
	public boolean checkCollision(Entity e)
	{
		if (Math.abs(e.get_y() - y) <= COLLISIONDISTANCE && Math.abs(e.get_x() - x) <= COLLISIONDISTANCE)
			return true;
		return false;
	}
	
}
