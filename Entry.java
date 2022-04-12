// This class holds information about a single training session
package com.stir.cscu9t4practical1;

import java.util.Calendar;
public class Entry {
  private String name;
  private Calendar dateAndTime;
  private float distance;
  
  public Entry (String n, int d, int m, int y, int h, int min, int s, float dist) {
    name = n;
    Calendar inst = Calendar.getInstance();
    inst.set(y,m-1,d,h,min,s);
    dateAndTime = inst;
    distance = dist;
  } //constructor
  
  public String getName () {
    return name;
  } //getName
  
  public int getDay () {
    return dateAndTime.get(Calendar.DATE);
  } //getDay
  
  public int getMonth () {
    int month =  dateAndTime.get(Calendar.MONTH) + 1;
    return month;
  } //getMonth
  
  public int getYear () {
    return dateAndTime.get(Calendar.YEAR);
  } //getYear

  public int getHour () {
    return dateAndTime.get(Calendar.HOUR);
  } //getHour

  public int getMin () {
    return dateAndTime.get(Calendar.MINUTE);
  } //getMin

  public int getSec () {
    return dateAndTime.get(Calendar.SECOND);
  } //getSec

  public float getDistance () {
    return distance;
  } //getYear

  public String getEntry () {
   String result = getName()+" ran " + getDistance() + " km in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
   return result;
  } //getEntry
  
  
   
} // Entry

class SprintEntry extends Entry {
	
	private int repetitions;
	private int recovery;

	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int repetitions, int recovery) {
		super(n, d, m, y, h, min, s, dist);
		this.recovery = recovery;
		this.repetitions = repetitions;
		
	}
	
	public int getRepetitions() {
		return repetitions;
	}

	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}

	public int getRecovery() {
		return recovery;
	}

	public void setRecovery(int recovery) {
		this.recovery = recovery;
	}
	
	@Override
	public String getEntry () {
		   String result = getName()+" sprinted " + getRepetitions() + "x" + (int) getDistance() + "m in "
		             +getHour()+":"+getMin()+":"+ getSec() + " with " + getRecovery() + " minutes recovery on "
		             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
		   return result;
		  }
}

class CycleEntry extends Entry {

	private String terrain;
	private String tempo;
	
	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String terrain, String tempo) {
		super(n, d, m, y, h, min, s, dist);
		this.terrain = terrain;
		this.tempo = tempo;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String way) {
		this.terrain = terrain;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
	@Override
	public String getEntry () {
		   String result = getName()+" cycled " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear()+ " on "+ getTerrain()+ " at "+ getTempo() + " tempo"+"\n";
		   return result;
		  }
	
}

class SwimEntry extends Entry {
	
	private String where;

	public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String where) {
		super(n, d, m, y, h, min, s, dist);
		this.where = where;
		
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}
	
	@Override
	public String getEntry () {
		   String result = getName()+" swam " + getDistance() + " km " + getWhere() + " in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
		   return result;
		  }
	
}