package com.lukario45.skyschedule.src;

public class Slot {
	String name;
	String times;
	Boolean availability;
	public Slot(String n, String t,Boolean a){
		this.name = n;
		this.times = t;
		this.availability = a;
	}
	public static void createSlots(){
		Slot a = new Slot("A","6:00-7:30", true);
	}
}
