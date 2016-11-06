import java.util.Scanner;
public class InventoryTrackerInterface {

	public static void main(String[] args){

<<<<<<< HEAD
		Scanner input = new Scanner(System.in);
=======
		 //Inventory inv;

		Item a = new Item("box",1,100.0,"level");
		Item c = new Item("box",1,100.0,"level");
		System.out.println(a.getName());
		System.out.println(a.getQuantity());
		System.out.println(a.getPrice());
		System.out.println(a.getUPC());
>>>>>>> ed97ed28414f6e1879c4f7933800171fce824a8e

		boolean active = true; // check the user status
		int num; // user option for switch statment

		Inventory b = new Inventory();

<<<<<<< HEAD
		while(active == true)
		{
			// variables to store user input
			String name;
			String upc;
			int quantity;
			double price;

			// Ask User what they wanna do
			System.out.println("1. Add item to Inventory");
			System.out.println("2. Get an items info");
			System.out.println("3. Save Inventory to file");
			System.out.println("4. Loard Inventory from file");
			System.out.println("5. Exit");

			num = input.nextInt();
			switch(num)
			{

				case 1:

					System.out.println("Enter new Item name");
					input.nextLine();
					name = input.nextLine();


					System.out.println("Enter new item quantity");
					quantity = input.nextInt();

					System.out.println("Enter new item price");
					price = input.nextDouble();

					System.out.println("Enter new item UPC");
					input.nextLine();
					upc = input.nextLine();

					// instance of the object
					Item a = new Item(name,quantity,price,upc);

					// add item to array
					b.addItem(a);
					break;

				case 2:

					int i = b.getTotalNumberOfItems() - 1;

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
					// diaplay all the data in the inventory
					b.loadInventoryFromFile("Inventory.txt");
					break;

				case 5:
					// exit out of the loop
					System.out.print("Exit: Goodbye !");
					active = false;
					break;

					default:
						System.out.println("Input not supported try again");
						break;
		  }
		}
		
		input.close();

=======

		b.addItem(a);
		b.addItem(a);
		b.addItem(c);


		System.out.println("Totoal number of Item " + b.getTotalNumberOfItems());
>>>>>>> ed97ed28414f6e1879c4f7933800171fce824a8e
	}

}
