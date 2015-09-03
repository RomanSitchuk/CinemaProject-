package ua.lviv.lgs;

public class Seance implements Comparable<Seance> {
	private Movie movie;
	private Time startTime;
	private Time endTime;

	Seance(Movie movie, Time startTime) {
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = new Time(startTime.getHours()
				+ movie.getDuration().getHours(), startTime.getMin()
				+ movie.getDuration().getMin());

	}

	public static Time endingTime(Time start, Time duration) {
		return new Time(start.getHours()+duration.getHours(),start.getMin()+duration.getMin());
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result
				+ ((startTime == null) ? 0 : startTime.hashCode());
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
		Seance other = (Seance) obj;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Сеанс [Фільм  : " + movie + ", Початок : " + startTime
				+ ", Кінець  = " + endTime;
	}

	@Override
	public int compareTo(Seance o2) {
		return this.getStartTime().compareTo(o2.getStartTime());
	}
}
