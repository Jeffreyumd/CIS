import javax.swing.JLabel;
import javax.swing.JPanel;

public class GreetingPanel extends JPanel{
	
	/**
	 * Constructor
	 */
	
	public GreetingPanel()
	{
		//create the label
		JLabel greeting = new JLabel("Welcome to Ivory's IceCream House");
		
		//add the label to the panel
		add(greeting);
	}

}
