package com.capgemini.presentationtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PresentationTesting {

	public boolean testvalidChoice(int v) {
    	boolean flag=false;
    	if(v==1 ||v==2) {
    		flag=true;
    	}
		return flag;
    	
    }
	
}
