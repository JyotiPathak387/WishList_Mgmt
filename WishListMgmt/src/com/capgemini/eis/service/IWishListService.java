package com.capgemini.eis.service;
import java.util.HashMap;

import com.capgemini.eis.bean.ProductDTO;
import com.capgemini.eis.exception.WishListException;

public interface IWishListService {

	public boolean addProductToWishlist(String productId) throws WishListException;
	public HashMap<String, ProductDTO> displayProductInWishlist();
}
