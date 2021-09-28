/////////////Creating Item Class/////////////////////////

import java.io.Serializable;

public class Item implements Serializable
{
	  
	  private int itemId ;
	  private   String  itemDescription ;
	  private int  itemQuantityAvailable ;
	  private  double itemUnitPrice ;
	  private int itemDiscountPercentage ;
	  
	  public Item() {
			super();
			// TODO Auto-generated constructor stub
		}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getItemQuantityAvailable() {
		return itemQuantityAvailable;
	}

	public void setItemQuantityAvailable(int itemQuantityAvailable) {
		this.itemQuantityAvailable = itemQuantityAvailable;
	}

	public double getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public int getItemDiscountPercentage() {
		return itemDiscountPercentage;
	}

	public void setItemDiscountPercentage(int itemDiscountPercentage) {
		this.itemDiscountPercentage = itemDiscountPercentage;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemDescription=" + itemDescription + ", itemQuantityAvailable="
				+ itemQuantityAvailable + ", itemUnitPrice=" + itemUnitPrice + ", itemDiscountPercentage="
				+ itemDiscountPercentage + "]";
	}
	  
	  
}

/////////////Creating Main Class To Serialize List Of Object////////////////////

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main 
{
	
	public static void main(String[] args) throws Exception
	{
		 ArrayList<Item> list = new ArrayList<Item>();
		  
		  Item item1 = new Item();
		  item1.setItemId(1);
		  item1.setItemDescription("Best In Class");
		  item1.setItemQuantityAvailable(2);
		  item1.setItemUnitPrice(1000);
		  item1.setItemDiscountPercentage(12);
		  
		  Item item2 = new Item();
		  item2.setItemId(2);
		  item2.setItemDescription("Best in Price");
		  item2.setItemQuantityAvailable(4);
		  item2.setItemUnitPrice(1000);
		  item2.setItemDiscountPercentage(24);
		  
		  Item item3 = new Item();
		  item3.setItemId(3);
		  item3.setItemDescription("Best In Service");
		  item3.setItemQuantityAvailable(6);
		  item3.setItemUnitPrice(1000);
		  item3.setItemDiscountPercentage(48);
		  
		  Item item4 = new Item();
		  item4.setItemId(4);
		  item4.setItemDescription("Best In Ability");
		  item4.setItemQuantityAvailable(8);
		  item4.setItemUnitPrice(1000);
		  item4.setItemDiscountPercentage(60);
		  
		  list.add(item1);
		  list.add(item2);
		  list.add(item3);
		  list.add(item4);
  
	   FileOutputStream FOS = new FileOutputStream("data.ser");
	   ObjectOutputStream OOS = new ObjectOutputStream(FOS);
	   OOS.writeObject(list);
	   
	   FileInputStream FIS = new FileInputStream("data.ser");
	   ObjectInputStream OIS = new ObjectInputStream(FIS);
	   
	   ArrayList list1 = (ArrayList)OIS.readObject();
	   
	   System.out.println("Item ID :"+"ItemDecs : "+"ItemQuantity : "+"ItemPrice : "+"ItemDiscount " );
	   for(Object obj : list1)
	   {
		  if(obj instanceof Item)
		  {
			  System.out.println(((Item) obj).getItemId()+" : "+((Item) obj).getItemDescription()+" : "+((Item) obj).getItemQuantityAvailable()+" : "+((Item) obj).getItemUnitPrice()+" : "+((Item) obj).getItemDiscountPercentage()+"%");
		  }
	   }
	   

	}

}

