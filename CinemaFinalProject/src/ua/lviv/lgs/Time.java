package ua.lviv.lgs;

public class Time implements Comparable<Time>{
	private int hours;
	private int min;

	
	Time (int hours,int min){
		int tempHour=0;
		if(min >59) tempHour=min/60;
		this.min=min%60;
		this.hours=hours%24+tempHour;
		
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + min;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		if(hours<10 && min<10)return "0"+hours+" : 0"+min ;
		else if(hours<10 && min>=10)return "0"+hours+" : " +min ;
		else if(hours>=10 && min<10)return hours+" : 0"+min ;
		else return hours + " : " + min;
	}

	@Override
	public int compareTo(Time o) {
		
		 if(this.getHours()<o.getHours() )return -1;
		else if(this.getHours()>o.getHours() )return 1;
		else if(this.getMin()>o.getMin() )return 1;
		else if(this.getMin()<o.getMin() )return -1;
		return 0;
	}

	

	

	
	
	
	
	
	
	
}
