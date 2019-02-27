import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * 
 * @author Kevin Guo Period 6
 *
 */
public class WalkingStickFigure extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Ellipse2D.Double head;
	private Rectangle body;
	private Rectangle leftArm;
	private Rectangle rightArm;
	private Rectangle leftLeg;
	private Rectangle rightLeg;
	
	public WalkingStickFigure() {
		head = new Ellipse2D.Double(10,10,10,10);
		this.setSize(100, 100);
		body = new Rectangle(11,21,8,20);
		leftArm = new Rectangle();
		rightArm = new Rectangle();
		leftLeg = new Rectangle();
		rightLeg = new Rectangle();
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(head);
		g2.draw(body);
	}
}
