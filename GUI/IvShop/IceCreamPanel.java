import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class IceCreamPanel extends JPanel{

	//cost of each ice cream
	public final double MINT = 3.50;
	public final double  CHOCOLATE = 3.50;
	public final double  MANGO = 4.25;
	public final double CARAMEL = 4.00;
	
	// following variables will reference radio
	// buttons for the ice cream choices 
	private JRadioButton mint;
	private JRadioButton chocolate;
	private JRadioButton mango;
	private JRadioButton caramel;
	
	//reference a buttonGroup object to group the radio
	private ButtonGroup bg;
	
	
	/**
	 * Constructor
	 */
	
	public IceCreamPanel()
	{
		//create grid layout with four rows and one column
		setLayout(new GridLayout(4,1));
		//color of background
		setBackground(Color.RED);
		
		//create the radio buttons
		mint = new JRadioButton("Mint", true);
		chocolate = new JRadioButton("Chocolate");
		mango = new JRadioButton("Mango");
		caramel = new JRadioButton("Caramel");
		
		// add a border around the panel
		setBorder(BorderFactory.createTitledBorder("IceCream"));
		
		// add the radio buttons to this panel
		add(mint);
		add(chocolate);
		add(mango);
		add(caramel);
	}
	
	
	/**
	 * This method returns the cost of 
	 * the selected ice cream
	 * @return cost
	 */
	public double getCost()
	{
		double cost = 0.0;
		
		//select ice cream
		if(mint.isSelected())
			cost = MINT;
		else if(chocolate.isSelected())
			cost = CHOCOLATE;
		else if(mango.isSelected())
			cost = MANGO;
		else if(caramel.isSelected())
			cost = CARAMEL;
		
		
		// return the selected cost
		return cost;
	}
}
