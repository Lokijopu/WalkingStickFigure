import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class WalkingStickFigureMain {

	public static void main(String[] args) {
		int x = 11;
		int y = 11;
		JFrame myFrame = new JFrame("Walking stick figure");
		myFrame.setLayout(null);
		myFrame.setBounds(400, 0, 500, 700);
		
		WalkingStickFigure man = new WalkingStickFigure();
		man.setLocation(11, 11);
		myFrame.add(man);
		
		myFrame.addKeyListener (new KeyListener() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					man.setLocation(x+1, y);
		        }
		        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		        	man.setLocation(x-1, y);
		        }
		        if (e.getKeyCode() == KeyEvent.VK_UP) {
					man.setLocation(x, y-1);
		        }
		        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		        	man.setLocation(x, y+1);
		        }
		    }
			public void keyReleased(KeyEvent e) {

			}
			public void keyTyped(KeyEvent e) {
			
			}
		});
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}