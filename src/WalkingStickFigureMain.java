import javax.swing.JFrame;

public class WalkingStickFigureMain {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Walking stick figure");
		myFrame.setLayout(null);
		myFrame.setBounds(400, 0, 500, 700);
		
		WalkingStickFigure man = new WalkingStickFigure();
		man.setLocation(11, 11);
		myFrame.add(man);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
