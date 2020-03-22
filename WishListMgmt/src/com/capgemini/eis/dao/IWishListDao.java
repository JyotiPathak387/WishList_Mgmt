package com.capgemini.eis.dao;


import java.util.HashMap;

import com.capgemini.eis.bean.ProductDTO;
import com.capgemini.eis.exception.WishListException;

public interface IWishListDao {
	public boolean addProductToWishlist(String productId) throws WishListException;
	public HashMap<String, ProductDTO> displayProductInWishlist();
}

