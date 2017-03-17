
/**
 * @author Jeffrey Alhassan
 * Date: 10/15/2016
 * HomeWork 2
 */


import java.io.*;
import java.util.Scanner;

public class Inventory {


	//variables for the Inventory class
	private Item itemArray[] = new Item[100]; //stores a instances of a Item
	private int totalItem = 0; //counts the number of item

	//Methods for the Inventory class

	/**
	 * @return totalItem
	 */
	public int getTotalNumberOfItems(){
		return totalItem;
	}


	/**
	 * get an item from itemArray
	 * @param index represents an item in the array
	 * checks to see if the array or the index is not empty
	 * @return itemArray[index]
	 */
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


	/**
	 * Add item to itemArray and update the totalItem count
	 * @param newItem
	 */
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



	/**
	 * Save inventory to file
	 * if the file does not exits creates one, however the data does not append
	 * write name,quality,price and upc on different line on the text file
	 * @param fileName -- name of the file it writes the on
	 */
	public void saveInventoryToFile(String fileName){

		try{

			// create instances of the txt file
			PrintWriter item = new PrintWriter(new FileWriter(fileName+".txt", false));

			item.println(totalItem);

			// write the info of the item on the text file
			for(int i=0; i < totalItem; i++)
			{

				item.println(getItem(i).getName());
				item.println(getItem(i).getPrice());
				item.println(getItem(i).getQuantity());
				item.println(getItem(i).getUPC());
			}

		 // close io instance
		 item.close();


		} catch(Exception e){

			System.out.println(e);
		}
	}


	/**
	 * read fileName and load data from file
	 * @param fileName
	 */
	public void loadInventoryFromFile(String fileName){

		try{


			// Instance to identify file
			File file = new File("Inventory.txt");

			// Instance to read and write on file
			Scanner Sreader = new Scanner(file);


			//first line of the code prints out the number of stored items
			//Read the number of item in the file
			int invNum = Sreader.nextInt();
			Sreader.nextLine(); // skip a line to avoid int to string issue

			/**
			 *  invNum -- controls the number of times it loops
			 *  collect the data and create a new Item
			 *  add Item to Inventory array
			 */
			for(int i=0; i < invNum; i++)
			{

				String name = Sreader.nextLine();
				double price = Sreader.nextDouble();
				int quantity = Sreader.nextInt();
				Sreader.nextLine();
				String upc = Sreader.nextLine();

				// instance of a item
				Item a = new Item(name,quantity,price,upc);
				addItem(a);

			}


			System.out.println("Inventory loaded");

			Sreader.close();

		} catch(Exception e){

			System.out.println(e);
		}

	}

}
