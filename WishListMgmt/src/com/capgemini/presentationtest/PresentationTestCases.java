package com.capgemini.presentationtest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PresentationTestCases {


	   PresentationTesting ct;
	   
	   @Before
		public  void setUp() {
			ct = new PresentationTesting();
		}
	   
	   @Test
		public void testvalidChoice() {
		   Assert.assertEquals(true,ct.testvalidChoice(1));
			
		}
	  
        @After
		public void cleanUp() {
			ct = null;
		}

}
