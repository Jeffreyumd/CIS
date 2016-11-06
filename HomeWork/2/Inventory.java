/**
 * BY Jeffrey Alhassan
 * Date: 10/15/2016
 * HomeWork 2
 * **/
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
	public void saveInventoryToFile(String fileName){
		/// write name, quality, price, upc on different lines on the text file
		try{
			// create instances of the txt file
		 FileWriter fwriter = new FileWriter(fileName+".txt", true);
		 PrintWriter item = new PrintWriter(fwriter);

		 // write the info of the item on the text file
		 for(int i=0; i < totalItem; i++){
		 item.println("");
		 item.println("Name: "+getItem(i).getName());
		 item.println("Price: "+getItem(i).getPrice());
		 item.println("Quantity: "+getItem(i).getQuantity());
		 item.println("UPC: "+getItem(i).getUPC());

		 }

		 fwriter.close();
		 item.close();


		} catch(Exception e){

			System.out.println("Something went wrong\nFile could not Write");
		}
	}

	// load inventory data from a file
	public void loadInventoryFromFile(String fileName){


		//Read created file, if file does not exits create one

		try{

			FileReader file = new FileReader(fileName+".txt"); //read the file
			BufferedReader breader = new BufferedReader(file); //print the collected string in a line

			String line = "";

			while((line = breader.readLine()) != null)
			{
				System.out.println(line);
			}

			file.close();
			breader.close();


		} catch(Exception e){
			System.out.println("Something went wrong\nfile could not Read");
		}

	}

}
