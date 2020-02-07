package com.mva.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverFinder {
	
	public Driver getDriverbylicensed(String licensedNum) {
		return DMV.drivers.get(licensedNum);
		
	}
	public List getAllDrivers() {
		return new ArrayList<Driver>(DMV.drivers.values());
		
	}


}
