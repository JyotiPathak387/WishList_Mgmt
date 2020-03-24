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
	   
	   @SuppressWarnings("deprecation")
	@Test
		public void testProductId() {
			Assert.assertEquals(true,st.testProductId("P103"));
			
		}
	   
	   @Test
		public void testProductIdForNullValues() {
			Assert.assertEquals(false,st.testProductIdForNullValues(""));
			
		}
		
		@After
		public void cleanUp() {
			st = null;
		}

}
