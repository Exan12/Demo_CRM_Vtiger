package MethodsPack;

import java.util.Scanner;

public class SwiggyApplication {
	
	/**
	 * This Method is used to Login To the Swiggy Application
	 */
	public static void loginToSwiggyApp(String Name)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username of Swiggy: ");
		String username = sc.nextLine();
		System.out.println("Enter Password of Swiggy: ");
		String password = sc.nextLine();
		if(username.equals("kiran") && password.equals("kiran@2210"))
		{
			System.out.println(Name+" Logged into Swiggy Applications Succesfully");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	/**
	 * This Method is Used To Greet the Customer
	 */
	public void greetToCustomer()
	{
		System.out.println("Hello, KIRAN Welcome To Swiggy: ");
	}
	
	/**
	 * This Method is used to Search And Select the Item in Swiggy Application
	 * @param item
	 */
	public void searchAndSelectItem(String item)
	{
		if(item.equals("Biryani") || item.equals("Pizza") || item.equals("Burger"))
		{
			System.out.println(item+" Was Selected");
		}
		else
		{
			System.out.println("Oh, Sorry! No Item Available");
		}
	}
	
	/**
	 * This Method is used to Add the Item into Cart
	 * @param Item
	 */
	public void AddToCart(String Item)
	{
		if(Item.equals("Biryani") || Item.equals("Pizza") || Item.equals("Burger"))
		{
			System.out.println(Item + " Added to cart Successfully");
		}
		else
		{
			System.out.println(Item+" Item not found,So Item not Added into Cart....");
		}
	}
	
	/**
	 * This method is used to place the Order Succesfully
	 * @param Item
	 */
	public void orderPlacing(String Item)
	{
		if(Item.equals("Biryani") || Item.equals("Pizza") || Item.equals("Burger"))
		{
			System.out.println(Item + " Order Placed Succesfully");
		}
		else
		{
			System.out.println(Item+" Item not found,So Order Not Placed....");
		}
	}
	
	/**
	 * This Method is used to Logged out from the Application
	 * @param Name
	 */
	public static void Logout(String Name)
	{
		System.out.println(Name + " Logged out from Swiggy Application Succesfully");
	}
	public static void main(String[] args) {
		
		
		
		SwiggyApplication sp = new SwiggyApplication();
		
		// Login To the Swiggy Application
		loginToSwiggyApp("KIRAN");
		
		// Greet the Customer
		sp.greetToCustomer();
		
		// Item Searched and Selected
		sp.searchAndSelectItem("Biryani");
		
		// AddToCart
		sp.AddToCart("Biryani");
		
		// Order Placing
		sp.orderPlacing("Biryani");
		
		// Logout
		Logout("KIRAN");
		
	}

}
