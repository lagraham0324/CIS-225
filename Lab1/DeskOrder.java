
/**
 * This program calculates the total cost of building a
 * wooden desk based on it's surface area, wood type,
 * and number of drawers. It also assigns an order number
 * and prints an invoice.
 * 
 * @Lauren Graham 
 * @Version 1.0 Wednesday January 28th, 2015
 */
public class DeskOrder
{
    // instance variables - replace the example below with your own
    private int price;
    private String name;
    private int count;
    private int orderNumber;
    private int length;
    private int width;
    private int drawerCount;
    private int mahogany;
    private int oak;
    private int pine;
    private int woodType;

    //Initializes values
    public DeskOrder()
    {
      drawerCount = 0;
      length = 0;
      width = 0;
      count = 0;
      woodType = 0;
    }
    
    //Recieve customer name
    //Input name: "name"
    //Returns order number
    public int setName(String fullName)
    {
     name = fullName;
     orderNumber = count + 1;
     return orderNumber;
    }
    
    //Shows order number
    public int getOrderNumber()
    {
     return orderNumber;
    }
   
    //Recieve a length from customer
    public void setLength(int leng)
    {
     length = leng;
    }
    
    //Shows inputed length
    public int getLength()
    {
     return length;
    }
    
    //Recieve a width from customer
    public void setWidth(int wid)
    {
     width = wid;
    }
    
    //Shows inputed width
    public int getWidth()
    {
     return width;
    }
    
    //Recieve drawer count from customer
    public void setDrawerCount(int drawer)
    {
     drawerCount = drawer;
    }
    
    //Shows inputed drawer count
    public int getDrawerCount()
    {
     return drawerCount;
    }
    
    //Asks for Wood Type
    //mahogany = 1,
    //oak = 2, pine = 3
    public int setWoodType(int wood)
    {
     woodType = wood;
     return woodType;
    }
    
    //Calculates total cost and prints invoice for the customer
    public void printInvoice()
    {
     price = 200;
     
     if (drawerCount > 0)
     {
      price = drawerCount*30;
     }
    
     if(length*width >= 750)
     {
      price = price + 50;
     }
     
     if(woodType == 1)
     {
      price = price + 150;
     }
     else if(woodType == 2)
     {
      price = price + 125;
     }
     else
     {
      price = price;
     }
     
      System.out.println("Customer Name: " + name);
      System.out.println("Order Number: " + orderNumber);
      System.out.println("Lenth: " + length);
      System.out.println("Width: " + width);
      System.out.println("Drawer Count: " + drawerCount);
      System.out.println("Wood Type: " + woodType);
      System.out.println("Total Price: " + price);
    }
    

}
