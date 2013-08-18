package com.lukario45.skyschedule.src;

public class SkySchedule {
	public static void tellConsole(String msg){
		System.out.println(msg);
	}
//test
	public static void main(String[] args) {
		tellConsole("Welcome to SkySchedule!");
		tellConsole("Initiating Bootup....");
		tellConsole("Creating Time Slots....");
		Slot.createSlots();
		tellConsole("Slots Created! Loading Days....");
		Days.loadDays();
		tellConsole("Days Loaded! Building Gyms....");
		Gyms.buildGyms();
		tellConsole("Gyms Built!");

	}

}
