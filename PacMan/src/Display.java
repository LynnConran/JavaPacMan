import javax.swing.*;
import java.awt.*;

public class Display {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Painter painter = new Painter();
		frame.add(painter);
		frame.setSize(Painter.PIXELS * 29 - 16,Painter.PIXELS * 30 + 7);
		frame.setVisible(true);
	}
}
