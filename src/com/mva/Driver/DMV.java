package com.mva.Driver;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DMV {

	public static Map<String, Driver> drivers = new HashMap<String, Driver>();

	public static void fillupDrivers() {
	
	    Driver d = new Driver();
	    d.setLicensedNum("25366hh");
	    d.setName("Blake");
	    Date n = new Date(12/12/90);
	    d.setDateOfBirth(n);
	    d.setAddress("122 ABC ct");
	    d.setAge("23");
	    
	    Driver d1 = new Driver();
	    d1.setLicensedNum("15366hh");
	    d1.setName("lake");
	    Date n1 = new Date(12/12/90);
	    d1.setDateOfBirth(n1);
	    d1.setAddress("122 ABC ct");
	    d1.setAge("23");
	    
		Driver d2 = new Driver();
		d2.setLicensedNum("99366hh");
	    d2.setName("ake");
	    Date n2 = new Date(12/12/90);
	    d2.setDateOfBirth(n2);
	    d2.setAddress("122 ABC ct");
	    d2.setAge("23");
	    
	  	Driver d3 = new Driver();
	  	d3.setLicensedNum("67366hh");
	    d3.setName("Blak");
	    Date n3 = new Date(12/12/90);
	    d3.setDateOfBirth(n3);
	    d3.setAddress("122 ABC ct");
	    d3.setAge("23");
	    
	    Driver d4 = new Driver();
	    d4.setLicensedNum("ss54366hh");
	    d4.setName("Balae");
	    Date n4 = new Date(12/12/90);
	    d4.setDateOfBirth(n4);
	    d4.setAddress("122 ABC ct");
	    d4.setAge("23");
		
		drivers.put("25366hh", d);
		drivers.put("15366hh", d1);
		drivers.put("99366hh", d2);
		drivers.put("67366hh", d3);
		drivers.put("54366hh", d4);
		
		
	}

}
