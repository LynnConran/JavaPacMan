import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Display implements KeyListener{
	
	public static JFrame frame = new JFrame();
	public static Painter painter = new Painter();
	
	public static ActionListener actionPerformer = new ActionListener()
	{
		public void actionPerformed(ActionEvent e) 
		{
			painter.pac.move();
			painter.repaint();
		}
	};
	


	public static void main(String[] args) {
		frame.addKeyListener(new Display());
		frame.add(painter);
		frame.pack();
		frame.setSize(Painter.PIXELS * 29 - 16,Painter.PIXELS * 30 + 7);
		frame.validate();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Timer timer = new Timer(100, actionPerformer);
		timer.start();
	}


	@Override
	public void keyPressed(KeyEvent e)
	{
		System.out.println("Key hit!");
		if (e.getKeyCode() == 37) // Left
		{
			painter.pac.setDir(Entity.LEFT);
		}
		else if (e.getKeyCode() == 38) // Up
		{
			painter.pac.setDir(Entity.UP);
		}
		else if (e.getKeyCode() == 37) // Right
		{
			painter.pac.setDir(Entity.RIGHT);
		}
		else if (e.getKeyCode() == 37) // Down
		{
			painter.pac.setDir(Entity.DOWN);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		//Intentionally empty
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//Intentionally empty
	}
	
}