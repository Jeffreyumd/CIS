/**
 * BY Jeffrey Alhassan
 * Date: 10/15/2016
 * HomeWork 2
 * **/
import java.util.Scanner;
public class InventoryTrackerInterface {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		boolean active = true; // check the user status
		int num; // user option for switch statement

		Inventory b = new Inventory();

		while(active == true)
		{
			// variables to store user input
			String name;
			String upc;
			int quantity;
			double price;

			// Ask User what they action
			System.out.println("1. Add item to Inventory");
			System.out.println("2. Get an items info");
			System.out.println("3. Save Inventory to file");
			System.out.println("4. Loard Inventory from file");
			System.out.println("5. Exit");

			num = input.nextInt();
			switch(num)
			{

				case 1:

					//ask user for item name in string
					System.out.println("Enter new Item name");
					input.nextLine();
					name = input.nextLine();

					//ask user for item quantity in int
					System.out.println("Enter new item quantity");
					quantity = input.nextInt();

					//ask user for item price in double
					System.out.println("Enter new item price");
					price = input.nextDouble();

					// ask user for item UPC in string
					System.out.println("Enter new item UPC");
					input.nextLine();
					upc = input.nextLine();

					// instance of the object
					Item a = new Item(name,quantity,price,upc);

					// add item to array
					b.addItem(a);
					break;

				case 2:

					// check to make sure the is a item in the array, also display number of array on the side
					int i = b.getTotalNumberOfItems() - 1; //array starts form 0
					if(i < 0)
					{
						System.out.println("No item in the Inventory");
					} else{

						//ask user for item number
						System.out.println("Which item info would you like [0-" + i +"]" ); // display what item number is available

						//store item number in num
						num = input.nextInt();

						// get item data from Inventory class
						b.getItem(num);
						System.out.println("Name: "+b.getItem(num).getName());
						System.out.println("Price: "+b.getItem(num).getPrice());
						System.out.println("Quantity: "+b.getItem(num).getQuantity());
						System.out.println("UPC: "+b.getItem(num).getUPC());
						}
					break;

				case 3:
					// call inventory to save item to file
					b.saveInventoryToFile("Inventory");
					System.out.println("Inventory Saved");
					break;

				case 4:
					// display all the data in the inventory
					b.loadInventoryFromFile("Inventory");
					break;

				case 5:
					// exit out of the loop
					System.out.print("Exit: Goodbye !");
					active = false;
					break;

					default:
						// if user types in something unavailable
						System.out.println("Input not supported try again");
						break;

		  } // end of switch statement
		} // end of while loop

		input.close();

	}

}
