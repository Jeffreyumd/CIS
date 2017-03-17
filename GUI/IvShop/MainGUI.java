import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class MainGUI extends JFrame{
	
	// panels for the options 
	private IceCreamPanel iceCream;
	private ToppingPanel toppings;
	private DrinksPanel drinks;
	private GreetingPanel banner;
	
	// Buttons 
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	
	
	private final double TAX_RATE = 0.05; 
	
	public MainGUI()
	{
		//display title
		setTitle("Order Calculator");
		
		//specify a an action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create a border layout manager
		setLayout(new BorderLayout());
		
		//create the custom panels
		banner = new GreetingPanel();
		iceCream = new IceCreamPanel();
		toppings = new ToppingPanel();
		drinks = new DrinksPanel();
		
		//create the button panel
		buildButtonPanel();
		
		//add the components to the content panel
		add(banner, BorderLayout.NORTH);
		add(toppings, BorderLayout.CENTER);
		add(drinks, BorderLayout.EAST);
		add(iceCream, BorderLayout.WEST);
		add(buttonPanel, BorderLayout.SOUTH);
		
		//pack the content of the window and display it
		pack();
		setVisible(true);
	}
	
	
	/**
	 * This method builds the button panel
	 */
	private void buildButtonPanel()
	{
		//create a panel for the buttons
		buttonPanel = new JPanel();
		
		//create the button
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		
		//register the action listeners
		calcButton.addActionListener(new CalcBottonListener());
		exitButton.addActionListener(new ExitButtonListener());
		
		//add the buttons to the button panel
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
		
	}
	
	/**
	 * The methods handle the events
	 * when the user clicks on of the Buttons
	 */
	
	private class CalcBottonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//variables for the calculations
			double subtotal, tax, total;
			
			//calculate the subtotal, tax and total
			subtotal = iceCream.getCost() + drinks.getCost() + toppings.getCost();
			tax = subtotal * TAX_RATE;
			total = subtotal + tax;
			
			//create a decimal format object to format output
			DecimalFormat dollar = new DecimalFormat("0.00");
			
			//display the charges
			JOptionPane.showMessageDialog(null,
					"Subtotal: $" + dollar.format(subtotal) + 
					"\n" + "Tax: $" + dollar.format(tax) + 
					"\n" + "Total: $" + dollar.format(total));
		}
	}
	
	private class ExitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Exit program
			System.exit(0);
		}
	}
	
	public static void main (String[] args)
	{
		new MainGUI();
	}

}
