package com.lukario45.skyschedule.src;

public class Days {
	String name;
	Boolean weekday;
	public Days(String n, Boolean w){
		this.name = n;
		this.weekday = w;
		
	}
	public static void createDays(){
		Days mon = new Days("Monday",true);
		Days tue = new Days("Tuesday",true);
		Days wed = new Days("Wednsday",true);
		Days thur = new Days("Thursday",true);
		Days fri = new Days("Friday",true);
		Days sat = new Days("Saturday",false);
		Days sun = new Days("Sunday",false);
	}

}
