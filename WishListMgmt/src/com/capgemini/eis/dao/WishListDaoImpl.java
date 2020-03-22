package com.capgemini.eis.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.eis.bean.ProductDTO;
import com.capgemini.eis.exception.WishListException;
import com.capgemini.eis.repository.ProductRepository;
import com.capgemini.eis.service.WishListServiceImpl;


public class WishListDaoImpl implements IWishListDao{


	//static  HashMap<String, ProductDTO> wlist1=new HashMap<String , ProductDTO>(); 
		WishListServiceImpl WishlistDaoImplObj=new WishListServiceImpl();
		static Scanner scan=new Scanner(System.in);
		
	/****************************** This function will add the Product to Wishlist ******************************/
		
		public boolean addProductToWishlist(String productId) throws WishListException {
			// TODO Auto-generated method stub
			boolean result=false;
			if(ProductRepository.productList.get(productId) != null)
			{   if(WishListServiceImpl.wlist.containsKey(productId))
		          	{	
				        throw new WishListException("WishList already contain this PRODUCT");
		        	}
			   else {
				 result=WishlistDaoImplObj.addProductToWishlist(productId);
			    return result;
			      }
				
			}
			else
			{
				throw new WishListException("Product ID not Found in Product List to Add in WishList\n");
			}
		   
			
		}


	/**************************** This function will return the wishlist ****************************/	
		public HashMap<String, ProductDTO> displayProductInWishlist()  {
			// TODO Auto-generated method stub
			
			return WishListServiceImpl.wlist ;
		}
	
}