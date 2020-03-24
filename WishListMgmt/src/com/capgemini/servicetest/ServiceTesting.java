package com.capgemini.servicetest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.eis.bean.ProductDTO;
import com.capgemini.eis.dao.WishListDaoImpl;

public class ServiceTesting {


	WishListDaoImpl wishlistDaoImpl=new WishListDaoImpl();
	
	 public boolean testProductId(String pid)
    {
    	boolean flag=false;
    	for(ProductDTO p : wishlistDaoImpl.getProductlist())
    	{
    		if(p.getProductId().equals(pid))
    		{
    		flag=true;	
    		}
    	}
    	
		return flag;
    	
    }
	 
    

	public boolean testProductIdForNullValues(String pid) {
		// TODO Auto-generated method stub
		boolean f=true;
    	if(pid.isEmpty())
    	{
    		f=false;
    	}
    	else
    	{
    		f=true;
    	}
    	return f;	
	}
	
    	


}
