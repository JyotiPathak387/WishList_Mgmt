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
	public void validTestProductId1() {
		Assert.assertEquals(true,dt.validTestProductId("P104"));
		
	}
	

	@Test
	public void testNameLength() {
		Assert.assertEquals(true,dt.validProductIdLength("P105"));
		
	}
	


	@After
	public void cleanUp() {
		dt = null;
	}
}
   
   
    	
