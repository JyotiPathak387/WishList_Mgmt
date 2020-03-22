package com.capgemini.daotest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.eis.dao.WishListDaoImpl;

public class DaoTesting {


    WishListDaoImpl dao=new WishListDaoImpl();
	//Testing Method1

  
  //Testing Method2
  public boolean validProductIdLength(String Product) {
  	boolean flag=false;
  	if((Product.length()== 4)) {
  		flag=true;
  	}
		return flag;
  	
  
}

public boolean validTestProductId(String product) {

  	boolean flag=false;
  	if((product.charAt(0)== 80)) {
  		flag=true;
  	}
  
		return flag;
  	
  
}}
