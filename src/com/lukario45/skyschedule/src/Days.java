package com.lukario45.skyschedule.src;

public class Days {
	String name;
	Boolean weekday;
	String[] slots;
	public Days(String n, Boolean w, String[] s){
		this.name = n;
		this.weekday = w;
		this.slots = s;
		
	}
	public static void createDays(){
		String[] allslots = {"a","b","c","d","e"};
		Days mon = new Days("Monday",true, allslots );
		Days tue = new Days("Tuesday",true,allslots);
		Days wed = new Days("Wednsday",true,allslots);
		Days thur = new Days("Thursday",true,allslots);
		Days fri = new Days("Friday",true,allslots);
		Days sat = new Days("Saturday",false,allslots);
		Days sun = new Days("Sunday",false,allslots);
	}

}
