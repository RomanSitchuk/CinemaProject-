package ua.lviv.lgs;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {

	private Set<Seance> set;

	Schedule() {
		set = new TreeSet<Seance>();
		set.add(new Seance(new Movie("Transformers", new Time(1, 33)),
				new Time(12, 33)));
		set.add(new Seance(new Movie("American Pie", new Time(2, 59)),
				new Time(10, 17)));
		set.add(new Seance(new Movie("Hot Chick", new Time(0,34 )),
				new Time(14, 56)));
		set.add(new Seance(new Movie("Profans", new Time(3, 43)),
				new Time(20, 12)));
				set.add(new Seance(new Movie("Bond 007", new Time(5, 17)),
				new Time(3, 35)));
	}

	public void addSeance(Seance seance) {

		
		set.add(seance);
	}
	public void removeSeance(Seance seance){
		set.remove(seance);
	}

	@Override
	public String toString() {
		String s = "";
		if (set.isEmpty()) {
			System.out.println("~~~ Немає нових фільмів у розкладі ~~~");
		} else {
			Iterator<Seance> iter = set.iterator();

			while (iter.hasNext()) {
				s += iter.next() + "\n";
			}

		}
		return s;
	}

	public Set<Seance> getSet() {
		return set;
	}

}
