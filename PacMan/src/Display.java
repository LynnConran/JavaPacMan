import javax.swing.*;
import java.awt.*;

public class Display {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Painter painter = new Painter();
		frame.add(painter);
		frame.setSize(1000,1000);
		frame.setVisible(true);
	}
}
