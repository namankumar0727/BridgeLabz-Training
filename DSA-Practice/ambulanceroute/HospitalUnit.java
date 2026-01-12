package com.ambulanceroute;
public class HospitalUnit {
	
	//Declaration of the variables
    String name;
    boolean available;
    HospitalUnit next;



    //Constructor
    public HospitalUnit(String name) {
        this.name = name;
        this.available = true;
    }
}
