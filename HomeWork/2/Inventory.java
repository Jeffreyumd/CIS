
/**
 * 
 * @author Jeffrey Alhassan
 * Date: 10/15/2016
 * HomeWork 2
 */


import java.io.*;
public class Inventory {
	

	//variables for the Inventory class
	private Item itemArray[] = new Item[100]; //stores a instances of a Item
	private int totalItem = 0;
	
	//Methods for the Inventory class
	// return totalItem
	public int getTotalNumberOfItems(){
		return totalItem;
	}
	
	
	// Returns an instances of a Item
	// Get the item's stores data from the Array
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
	
	// assign item to a variable
	// add Item into the Array
	public void addItem(Item newItem){
		
		// check to see if item is a Instance of a Item, then check if the Item has been added 
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
	/// write name, quality, price, upc on different lines on the text file
	public void saveInventoryToFile(String fileName){
		
		try{
			
			// create instances of the txt file
			PrintWriter item = new PrintWriter(new FileWriter(fileName+".txt", true));
		 
			// write the info of the item on the text file
			for(int i=0; i < totalItem; i++)
			{
				item.println("");
				item.println("Name: "+getItem(i).getName());
				item.println("Price: "+getItem(i).getPrice());
				item.println("Quantity: "+getItem(i).getQuantity());
				item.println("UPC: "+getItem(i).getUPC());
			}
		 
		 // close io instance
		 item.close();
		 
		 
		} catch(Exception e){
			
			System.out.println("Something went wrong\nFile could not Write");
		}
	}
	
	// load inventory data from a file
	public void loadInventoryFromFile(String fileName){
		
		
		//Read created file, if file does not exits create one
		
		try{
			
			// instance to Read file
			BufferedReader Freader = new BufferedReader(new FileReader(fileName+".txt"));
			
			// store read line 
			String line = "";
			
			//loop until all the line on the page is read 
			while((line = Freader.readLine()) != null)
			{
				System.out.println(line);
			}
			
			// close the io instance
			Freader.close();

			
		} catch(Exception e){
			System.out.println("Something went wrong\nfile could not Read");
		}
		
	}
	
}
