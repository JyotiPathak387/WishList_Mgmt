package com.capgemini.servicetest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.eis.dao.WishListDaoImpl;

public class ServiceTesting {


	WishListDaoImpl dao1=new WishListDaoImpl();
	
	public boolean validateProductId(String pid) {
        boolean result=false;
		for(int i=0;i< pid.length();i++)
		{
		if((pid.length()==4) && pid.startsWith("P"))
		{
		result=true;	
		}
		}
		return result;
    		
    
}
   
    
    public boolean validateProduct(String pid) {
    	boolean f=false;
    	if(pid.isEmpty())
    	{
    		f=true;
    	}
    	else
    	{
    		f=false;
    	}
    	return f;			
    }
	
    	


}
