import javax.swing.JFrame;

/**
 * 
 * @author Kevin Guo Period 6
 *
 */
public class WalkingStickFigure extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WalkingStickFigure() {
		JFrame myFrame = new JFrame("Walking man");
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new WalkingStickFigure();
	}
}
