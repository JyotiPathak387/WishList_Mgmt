package com.capgemini.presentationtest;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.capgemini.daotest.DaoTestCases;
import com.capgemini.servicetest.ServiceTestCases;


@RunWith(Suite.class)

@SuiteClasses({
	PresentationTestCases.class,
	//ServiceTestCases.class,
	DaoTestCases.class
})
public class TestSuites {

		public static void main(String[] args) {

			Result results = JUnitCore.runClasses(TestSuites.class);
			
			System.out.println("Test Result:"+results.wasSuccessful());
			
			System.out.println("No.of Failures:"+results.getFailureCount());
			
			
			List<Failure> failures = results.getFailures();
			
			for(Failure f:failures) {
				System.out.println("Failure is:"+f);
			}
			
			
		}
	}
