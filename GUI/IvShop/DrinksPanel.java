import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DrinksPanel extends JPanel{
	
	// cost of drinks 
	public final double NONE = 0.0;
	public final double WATER = 0.99;
	public final double SODA = 1.25;
	public final double COFFEE = 2.00;
	
	//radio buttons for the drinks
	private JRadioButton none;
	private JRadioButton water;
	private JRadioButton soda;
	private JRadioButton coffee;
	
	private ButtonGroup bg;
	
	/**
	 * Constructor
	 */
	public DrinksPanel()
	{
		//create a grid layout with four rows and one column
		setLayout(new GridLayout(4,1));
		//color of background
		setBackground(Color.RED);
		
		//create the radio buttons
		none = new JRadioButton("None", true);
		water = new JRadioButton("Water");
		soda = new JRadioButton("Soda");
		coffee = new JRadioButton("Coffee");
		
		//Group the radio buttons and add them to this panel
		bg = new ButtonGroup();
		bg.add(none);
		bg.add(coffee);
		bg.add(water);
		bg.add(soda);
		
		//add a border around the panel
		setBorder(BorderFactory.createTitledBorder("Drinks"));
		
		//add the radio buttons to the panel
		add(none);
		add(water);
		add(soda);
		add(coffee);
		
	}
	
	public double getCost()
	{
		double cost = 0.0;
		
		if(none.isSelected())
			cost = NONE;
		if(water.isSelected())
			cost = WATER;
		if(soda.isSelected())
			cost = SODA;
		if(coffee.isSelected())
			cost = COFFEE;
		
		return cost;
	}
}
