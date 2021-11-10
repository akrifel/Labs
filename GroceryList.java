
/*
public   GroceryItemOrder(String   name,   int   quantity,   double   pricePerUnit) Constructs  an  item  order  to  purchase  the  item  with  the  given  name,  in  the  given quantity, which costs the given price per unit. 
public double getCost() returns the total cost of this item in its given quantity. For example, four boxes of cookies that cost 2.30 per unit have a total cost of 9.20. 
public  void  setQuantity(int  quantity)  Sets  this  grocery  item’s  quantity  to  be  the given value.
public String toString() Return the quantity and the name of the item.
*/
import java.util.*;
import java.text.DecimalFormat;

public class GroceryItem {
    String itemName;
    Double ppu; // Price Per Unit
    int itemQuantity;

    /*
     * public static void main(String[] args) {
     * 
     * System.out.println("Please add an item name "); Scanner sonsole = new
     * Scanner(System.in); String Sname = sonsole.nextString(); name=Sname;
     * System.out.println("Please Add Item Price"); double Sprice =
     * sonsole.nextDouble(); ppU = Sprice
     * System.out.println("Please add an item amount"); int sAmount =
     * sonsole.nextInt(); itemQuantity = sAmount;
     * 
     * 
     * }
     */

    public void GroceryItemOrder(String name, int quantity, double pricePerUnit) {
        itemName = name;
        ppu = pricePerUnit;
        itemQuantity = quantity;

    }

    public double getCost() {
        return (double) itemQuantity * ppu;
    }

    public void setQuantity(int quantity) {
        itemQuantity = quantity;
    }

}

/*
 * public GroceryList() Constructs a new empty grocery list. public void add
 * (GroceryItemOrder item) Adds the given item order to this list if the list
 * has fewer than 10 items. public double getTotalCost() Returns the total sum
 * cost of all grocery item orders in this list.
 */
public class GroceryList {
    list<GroceryItem> list = null;
    int i; // index

    public GroceryList()// Constructs a new empty Grocery List
    {
        list = new ArrayList<GroceryItem>();
        this.num = 0;
    }

    public void add(GroceryItemOrder item) // AAdds the given item order to this list if the list has fewer than 10
                                           // items.
    {
        list.add(item);
        System.out.println("Added Item: " + item.getname());
        System.out.println(" Price Per Unit: " + item.getPricePerUnit());
        System.out.println("Quantity: " + item.getQuanitity);
        System.out.println("Final Cost Of Item: " + item.getQuanitity() * item.getPricePerUnit());
    }

    public double getTotalCost() {
        double totalCost;
        for (int x = 0; x < list.size(); x++) {
            totalCost += list.get(x).getCost();
        }
        return totalCost;
    }

    public String toString() {
        return "GroceryList [list =" + list + ", number =" + i + "]";
        ;
    }

}

public class TestGroceryList {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many items do you want to create? ");
        int numItem = console.nextInt();
        GroceryList myList = new GroceryList();
        for (int i = 0; i < numItem; i++) {
            System.out.println("Enter the name for the item " + (i + 1) + ": ");
            String name = console.next();
            System.out.println("Enter the price for the item " + (i + 1) + ": ");
            double price = console.nextDouble();
            GroceryItemOrder item = new GroceryItemOrder(name, 0, price);
            System.out.println("Enter the quantity for the item " + (i + 1) + ": ");
            int quantity = console.nextInt();
            item.setQuantity(quantity);
            System.out.println("The total price for " + item.toString() + " is: " + item.getCost());
            myList.add(item);

        }
        // ********call getTotalCost methodSystem.out.println("*********************");
        System.out.println("The total price for the grocery list is: " + myList.getTotalCost());
    }
}
