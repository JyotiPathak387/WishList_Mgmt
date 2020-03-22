package com.capgemini.eis.pi;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import com.capgemini.eis.bean.ProductDTO;
import com.capgemini.eis.dao.WishListDaoImpl;
import com.capgemini.eis.exception.WishListException;
import com.capgemini.eis.repository.ProductRepository;
public class CreateWishList {

static public WishListDaoImpl wListobj=new  WishListDaoImpl();
static Scanner scan=new Scanner(System.in);
public static void main(String arg[]) throws WishListException
{
   {
	ProductRepository.createProductList();
   }
	    HashMap<String , ProductDTO> wishlist=ProductRepository.getProductList();
	    for(Entry<String, ProductDTO> me:wishlist.entrySet())
	  {
		System.out.println("Product ID: "+me.getKey()+" ,Car Name: "+me.getValue().getProductName()+" , Product Category: "+me.getValue().getProductCategory()+" , Colour: "+me.getValue().getColor()+" , Specification: "+me.getValue().getSpecification()+" , Manufacturer: "+me.getValue().getManufacturer()+" , Price: "+me.getValue().getProductPrice());
	    System.out.println();
	  }
		wishlistOperation();
     }

/*********************** This function will show the Operation on WishList ***********************/	
	
	static public void wishlistOperation() throws WishListException
	{ String decisionValue="";
		boolean decision=true;
		System.out.println("=====================================");
		System.out.println("Welcome to WishList Management System");
		System.out.println("=====================================");
	   while(decision)
	   {
		System.out.println("Press 1 to insert in Wishlist");
		System.out.println("Press 2 to view Wishlist");
		int choice;
		
		choice=scan.nextInt();
	    
	   
		switch(choice)
		{
		case 1:  createWishlist();
		         break;  
		case 2: display();
		        break;
		default: System.out.println("WRONG CHOICE");
		}
		System.out.println("Want to Perform more Operation On Wishlist(yes/no)");
		  decisionValue=scan.next();
		  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
		  {
			  if(decisionValue.equalsIgnoreCase("yes"))
			  {
				  decision=true;
			  }
			  else
			  {
				  decision=false;
			  }
		  }
		  else
		  {  boolean check=true;
		     while(check)
		     {
			  System.out.println("Please Enter in yes or no");
			  decisionValue=scan.next();
			  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
			  {
				  if(decisionValue.equalsIgnoreCase("no"))
				  {
					  decision=false;
				  }
				  check=false;
			  }
		     }
		  }
		  
		 
	 }
 
	}
	
/*********************** This function will create the Wishlist ***********************/
	static public void createWishlist() throws WishListException
	{
	
		 System.out.println("CREATE WISHLIST");
		 String decisionValue="";
		 boolean decision=true;
		
		 while(decision)
		 {
			
			  try {
				  System.out.println("Enter ProductID to insert in Wishlist");
				  scan.nextLine();
			  String pid= scan.nextLine();
			  boolean result=wListobj.addProductToWishlist(pid);
			  if(result)
			  {
				  System.out.println("Added Successfully");
			  }
			  }
			  catch(WishListException e)
			  {
				System.out.print(e.getMessage());
			  } 
			  System.out.println("Want to Enter more in Wishlist(yes/no)");
			  decisionValue=scan.next();
			  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
			  {
				  if(decisionValue.equalsIgnoreCase("yes"))
				  {
					  decision=true;
				  }
				  else
				  {
					  decision=false;
				  }
			  }
			  else
			  {  boolean check=true;
			     while(check)
			     {
				  System.out.println("Please Enter in yes or no");
				  decisionValue=scan.next();
				  if(decisionValue.equalsIgnoreCase("yes") || decisionValue.equalsIgnoreCase("no"))
				  {
					  if(decisionValue.equalsIgnoreCase("no"))
					  {
						  decision=false;
					  }
					  check=false;
				  }
			     }
			  }	 
		 }	  
}
	
/******************************* This function will display the Wishlist *******************************/
	static public void display()
	{
		System.out.println("YOUR WISHLIST\n");
		
		HashMap<String, ProductDTO>wishlist=wListobj.displayProductInWishlist();
		for(Entry<String, ProductDTO> me:wishlist.entrySet())
		{
			System.out.println("Product ID: "+me.getKey()+" ,Car Name: "+me.getValue().getProductName()+" , Product Category: "+me.getValue().getProductCategory()+" , Colour: "+me.getValue().getColor()+" , Specification: "+me.getValue().getSpecification()+" , Manufacturer: "+me.getValue().getManufacturer()+" , Price: "+me.getValue().getProductPrice());
		    System.out.println();
		}
		
	}
}
