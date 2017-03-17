import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ToppingPanel extends JPanel{
	
	//cost of toppings
	final double NUTS = 0.50;
	final double WHIPPEDCREAM = 0.25;
	final double SPRINKELS = 0.25;
	final double ALL = 2.00;
	final double FRUITS = 1.00;
	final double NO = 0.00;
	
	//check boxes for toppings
	private JCheckBox nuts;
	private JCheckBox whippedCream;
	private JCheckBox sprinkels;
	private JCheckBox fruits;

	
	
	
	/**
	 * Constructor
	 */
	public ToppingPanel()
	{
		//create grid layout with six rows and one column
		setLayout(new GridLayout(6,1));
		//color of background
		setBackground(Color.CYAN);
		
		//create the check boxes
		nuts = new JCheckBox("Nuts");
		whippedCream = new JCheckBox("Whipped Cream");
		sprinkels = new JCheckBox("Sprinkels");
		fruits = new JCheckBox("Fruits");

		
		//add a border around the panel
		setBorder(BorderFactory.createTitledBorder("Toppings"));
		
		//add the check boxes
		
		add(nuts);
		add(whippedCream);
		add(sprinkels);
		add(fruits);
		
		
	}
	
	/**
	 * This method returns the cost
	 * of the selected toppings
	 * @return cost
	 */
	public double getCost()
	{
		double cost = 0.0;
		
		if(nuts.isSelected())
			cost+= NUTS;
		if(whippedCream.isSelected())
			cost+= WHIPPEDCREAM;
		if(sprinkels.isSelected())
			cost+= SPRINKELS;
		if(fruits.isSelected())
			cost+= FRUITS;
		
		return cost;
	}
}
