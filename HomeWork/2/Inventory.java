
public class Inventory {


	//variables for the Inventory class
	private Item itemArray[] = new Item[100]; //stores a instances of a Item
	private int totalItem = 0;

	//Methods for the Inventroy class
	// return totalItem
	public int getTotalNumberOfItems(){
		return totalItem;
	}


	// retunrs an instances of a Item
	public Item getItem(int index){

		//error check
		if(index < 0 || index >= totalItem)
		{
			return null;
		}
		else
		{
			return itemArray[index];
		}
	}

	// assgine item to a variable
	public void addItem(Item newItem){

		// check to see if item has been added
		if(newItem == null)
		{
			System.out.println("Item not added");
		}
		else
		{
			itemArray[totalItem] = newItem;
			totalItem++; //update totalNumber
		}

	}


	//create and save inventory data to a file
	public void saveInventoryToFile(String fileName){

	}

	// load inventory data from a file
	public void loadInventoryFromFile(String fileName){

	}





}
