package com.mva.findertest;

import java.util.List;

import com.mva.Driver.DMV;
import com.mva.Driver.Driver;
import com.mva.Driver.DriverFinder;

public class Test2App {

	public static void main(String[] args) {
		DMV.fillupDrivers();
        DriverFinder dd = new DriverFinder();
        List<Driver> list = dd.getAllDrivers();
        //System.out.println(list.toString());
        
        for(Driver s : list) {
        	System.out.println(s.toString());
        }
        
		
		
	}

}
