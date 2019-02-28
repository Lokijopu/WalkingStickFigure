import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingStickFigureMain {

	public static void main(String[] args) {

		JFrame myFrame = new JFrame("Walking stick figure");
		myFrame.setLayout(null);
		myFrame.setBounds(400, 0, 495, 700);
		
		WalkingStickFigure man = new WalkingStickFigure();
		man.setLocation(10, 10);
		myFrame.add(man);
		Timer t1 = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		t1.start();
		
		myFrame.addKeyListener (new KeyListener() {
			ArrayList<KeyEvent> keyList = new ArrayList<KeyEvent>();
			public void keyPressed(KeyEvent e) {
				int x = man.getX();
				int y = man.getY();
				final int  stepLength = 10;
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (x < 450) {
						x = x + stepLength;
						man.setLocation(x, y);
					}
		        }
		        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		        	if (x > 0) {
		        		x = x - stepLength;
			        	man.setLocation(x, y);
		        	}
		        }
		        if (e.getKeyCode() == KeyEvent.VK_UP) {
		        	if (y > -5) {
		        		y = y - stepLength;
						man.setLocation(x, y);
		        	}
		        }
		        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		        	if (y < 600) {
		        		y = y + stepLength;
			        	man.setLocation(x, y);
		        	}
		        }
		    }
			public void keyReleased(KeyEvent e) {
				for (int i = keyList.size() - 1; i >= 0; i--) {
					keyList.remove(i);
				}
			}
			public void keyTyped(KeyEvent e) {
			
			}
		});
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}