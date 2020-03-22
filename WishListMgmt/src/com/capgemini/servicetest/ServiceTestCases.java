package com.capgemini.servicetest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ServiceTestCases {

	ServiceTesting st;
	   @Before
		public  void setUp() {
			st = new ServiceTesting();
		}
	   
	   @Test
		public void validateProductId() {
			Assert.assertEquals(true,st.validateProductId("P103"));
			
		}
	/*	@Test
		public void validateProduct() {
			Assert.assertEquals(true,st.validateProductId(""));
			
		}*/
		
		@After
		public void cleanUp() {
			st = null;
		}

}
