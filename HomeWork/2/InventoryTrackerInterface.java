
public class InventoryTrackerInterface {

	public static void main(String[] args){

		 //Inventory inv;

		Item a = new Item("box",1,100.0,"level");
		Item c = new Item("box",1,100.0,"level");
		System.out.println(a.getName());
		System.out.println(a.getQuantity());
		System.out.println(a.getPrice());
		System.out.println(a.getUPC());


		Inventory b = new Inventory();


		b.addItem(a);
		b.addItem(a);
		b.addItem(c);


		System.out.println("Totoal number of Item " + b.getTotalNumberOfItems());
	}

}
