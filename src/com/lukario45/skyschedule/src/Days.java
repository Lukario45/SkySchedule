package com.lukario45.skyschedule.src;

public class Days {
	String name;
	Boolean weekday;
	Boolean allSlots;
	public Days(String n, Boolean w, Boolean a){
		this.name = n;
		this.weekday = w;
		this.allSlots = a;
		
	}
	public static void createDays(){
		
		Days mon = new Days("Monday",true, false );
		Days tue = new Days("Tuesday",true, false);
		Days wed = new Days("Wednsday",true, false);
		Days thur = new Days("Thursday",true, false);
		Days fri = new Days("Friday",true, false);
		Days sat = new Days("Saturday",false, true);
		Days sun = new Days("Sunday",false, true);
	}

}
