package com.capgemini.daotest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.eis.bean.ProductDTO;
import com.capgemini.eis.dao.WishListDaoImpl;

public class DaoTesting {


    WishListDaoImpl dao=new WishListDaoImpl();
	//Testing Method1

  
  //Testing Method2
  public boolean testProductIdForLength(String Product) {
  	boolean flag=false;
  	if((Product.length()== 4) && (Product.charAt(0) == 80)){
  		flag=true;
  	}
		return flag;
  	
  
}

  public boolean testProductIdName(String pid)
  {
	  boolean flag=false;
	 if(pid.startsWith("P"))
	 {
		 flag=true;
	 }
	 
	 return flag;
  }
  
  
/*public boolean testvalidProductId(String product) {

  	boolean flag=false;
  	for(ProductDTO p: dao.getProductlist())
  	if(p.getProductId().equals(product)){
  		
  		flag=true;
  	}
  
		return flag;
  	
  
}*/

public Object testProductForNullValues(String ProductId) {
      boolean flag=false;
      if(ProductId.isEmpty())
      {
    	  flag=true;
      }
      
      return flag;
}}
