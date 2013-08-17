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
		Slot a = new Slot("A","6:00PM-7:30PM", true);
		Slot b = new Slot("B","7:30PM-9:00PM", true);
		Slot c = new Slot("C","9:00AM-10:00AM", true);
		Slot d = new Slot("D","10:30AM-12:00PM", true);
		Slot e = new Slot("E","12:00PM-1:30PM", true);
		Slot f = new Slot("F","1:30PM-3:00PM", true);
		Slot g = new Slot("G","3:00PM-4:30PM", true);
		Slot h = new Slot("H","4:30PM-6:00PM", true);
		Slot specMS = new Slot("SpecialMS","6:00PM-8:00PM", true);//Middle School Only
		
		
	}
}
