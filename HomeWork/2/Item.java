
public class Item {

	//variable for the Item class
	private String name;
	private String upc;
	private int quantity;
	private double price;



	//methods for the Item class
	// private constructor
	private Item()
	{

	}

	// Second constructor with parameters
	public Item(String name, int qty, double price, String upc)
	{
		//collect and assign data to the right variable
		this.name = name;
		this.upc = upc;
		this.quantity = qty;
		this.price = price;
	}

	// method returns name
	public String getName(){
		return name;
	}

	// returns quantity
	public int getQuantity(){
		return quantity;
	}

	// returns price
	public double getPrice(){
		return price;
	}

	// returns upc
	public String getUPC(){
		return upc;
	}


}
