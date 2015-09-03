package ua.lviv.lgs;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;






public class Cinema {

	Map<Days, Schedule> scheduleMap;
	Time openTime;
	Time closeTime;

	Cinema(Time openTime, Time closeTime) {
		scheduleMap = new TreeMap();
		this.openTime = openTime;
		this.closeTime = closeTime;
		Days[] tempDays = Days.values();
		for (int i = 0; i < tempDays.length; i++) {
			scheduleMap.put(tempDays[i], new Schedule());
		}
	}

	

	public boolean checkTime(Time start, Time end) {

		if (start.compareTo(openTime) == 1 && end.compareTo(closeTime) == -1
				&& closeTime.compareTo(openTime) == 1) {
			return true;
		} else
			return false;

	}

	public void addMovie(Movie movie, Time... time) {

		Days days[] = Days.values();

		for (int i = 0; i < days.length; i++) {
			for (int j = 0; j < time.length; j++) {
				if (checkTime(time[j],
						Seance.endingTime(time[j], movie.getDuration()))) {
					scheduleMap.get(days[i]).addSeance(
							new Seance(movie, time[j]));

				}
			}
		}

	}

	public void addSeance(String nameOfDay, Seance seance) {
		Days days[] = Days.values();
		
		for (int i = 0; i < days.length; i++) {
			if(days[i].toString().equalsIgnoreCase(nameOfDay)){
				if(checkTime(seance.getStartTime(), seance.getEndTime())){
					scheduleMap.get(days[i]).addSeance(seance);
				}
			}
		}
	}
	
	public void removeMovie(String  nameOfFilm){
		
		Days[]days=Days.values();
		for (int i = 0; i < days.length; i++) {
			
			
			Iterator <Seance> iter =scheduleMap.get(days[i]).getSet().iterator();
				while(iter.hasNext()){
					if(iter.next().getMovie().getTitle().equalsIgnoreCase(nameOfFilm)){
						iter.remove();
					}
				
			
			
			}
					
					
		}
		
		
	}
	
	public void removeSeance(String dayOfTheWeak ,Seance seance){
		
		Days days[]=Days.values();
		for (int i = 0; i < days.length; i++) {
			if(days[i].toString().equalsIgnoreCase(dayOfTheWeak)){
				scheduleMap.get(days[i]).removeSeance(seance);
			}
		}
		
		
		
	}
	@Override
	public String toString() {
		String out1 = "~~~~~~~~~~~~~~~~~~CINEMA~~~~~~~~~~~~~~~~\n"
				+ "~~~WORKING EVERYDAY FROM " + this.openTime.toString() + " TO "
				+ this.closeTime.toString() + "~~~\n";

		Iterator<Map.Entry<Days, Schedule>> iter = scheduleMap.entrySet()
				.iterator();
		String out = "";
		String tempK = "";
		String tempV = "";
		while (iter.hasNext()) {
			Entry<Days, Schedule> temp = iter.next();
			tempK = "\n-----" + temp.getKey().toString() + "------\n";
			tempV = temp.getValue().toString();
			out += tempK + tempV;
		}

		return out1 + out;
	}
}
