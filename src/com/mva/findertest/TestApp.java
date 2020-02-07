package com.mva.findertest;

import java.util.List;

import com.mva.Driver.DMV;
import com.mva.Driver.Driver;
import com.mva.Driver.DriverFinder;

public class TestApp {

	public static void main(String[] args) {
		DMV.fillupDrivers();
        DriverFinder dd = new DriverFinder();
		Driver driver = dd.getDriverbylicensed("25366hh");
		System.out.println(driver.toString());
		
		

	}

}
