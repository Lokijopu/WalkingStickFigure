
	import java.awt.Color;
import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
	import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

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
		private ArrayList<Shape> parts;
		public WalkingStickFigure() {
			parts = new ArrayList<Shape>();
			head = new Ellipse2D.Double(10,10,10,10);
			parts.add(parts.size(), head);
			body = new Rectangle(11,21,8,20);
			parts.add(parts.size(), body);
			leftArm = new Rectangle(0, 21, 10, 8);
			parts.add(parts.size(), leftArm);
			rightArm = new Rectangle(19, 21, 10, 8);
			parts.add(parts.size(), rightArm);
			leftLeg = new Rectangle(7, 41, 8, 20);
			parts.add(parts.size(), leftLeg);
			rightLeg = new Rectangle(15, 41, 8, 20);
			parts.add(parts.size(), rightLeg);
			this.setSize(30, 70);
		}
		
		public void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.BLUE);
			for (Shape i: parts) {
				g2.draw(i);
				g2.fill(i);
			}
		}
	}
