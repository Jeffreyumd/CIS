import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame window = new JFrame("my app");
		window.setSize(800, 600);
		
		window.setResizable(false);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("This is a label");
		
		panel.add(label);
		window.add(panel);
		
		window.setVisible(true);

	}

}
