package com.lukario45.skyschedule.src;

public class Gyms {
	String name;
	Boolean availability;
	public Gyms(String n, Boolean a){
		this.name = n;
		this.availability = a;
		
	}
	public static void buildSchools(){
		Gyms pve = new Gyms("PVE", true);
		Gyms pvi = new Gyms("PVI", true);
		Gyms mso = new Gyms("MSO", true);
		Gyms msn = new Gyms("MSN", true);
		Gyms hso = new Gyms("HSO", true);
		Gyms hsn = new Gyms("HSN", true);//Sometimes
		
		
	}

}
