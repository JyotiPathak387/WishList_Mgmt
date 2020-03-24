package com.capgemini.daotest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.eis.dao.WishListDaoImpl;

public class DaoTestCases {


	   DaoTesting dt;
	   @Before
		public  void setUp() {
			dt = new DaoTesting();
		}

	
	//Testing methods
	@Test
	public void testProductIdForLength() {
		Assert.assertEquals(true,dt.testProductIdForLength("P104"));
		
	}
	

	@Test
	public void testProductIdName() {
		Assert.assertEquals(true,dt.testProductIdName("P105"));
		
	}
	
	@Test
	/*public void testvalidProductId() {
		Assert.assertEquals(false,dt. testvalidProductId("P105"));
		
	}*/

    public void testProductIdForNullValues()
    {
    	Assert.assertEquals(true,dt.testProductForNullValues(""));
    }
	@After
	public void cleanUp() {
		dt = null;
	}
}
   
   
    	
