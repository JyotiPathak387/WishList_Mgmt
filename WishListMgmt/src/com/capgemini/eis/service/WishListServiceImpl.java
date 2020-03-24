package com.capgemini.eis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.capgemini.eis.bean.ProductDTO;
import com.capgemini.eis.exception.WishListException;
import com.capgemini.eis.repository.ProductRepository;

public class WishListServiceImpl implements IWishListService {

	public static  HashMap<String, ProductDTO> wlist=new HashMap<String , ProductDTO>(); 
	List<String> productlist =new ArrayList<String>(wlist.keySet());
	/******************* This function will add the specified product to Wishlist **********************/
		
		public boolean addProductToWishlist(String productId) throws WishListException {
			// TODO Auto-generated method stub
		    wlist.put(productId,ProductRepository.productList.get(productId));
			return true;
		}

	/******************** This function will return the wishlist ********************/
		public HashMap<String, ProductDTO> displayProductInWishlist() {
			// TODO Auto-generated method stub
			return wlist;
		}


}
