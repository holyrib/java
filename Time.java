
public class Time {
	static int hour;
	static int minute;
	static int second;
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setHour(int Hour) {
		this.hour = hour;
	}
	public int getHour() {		
		return this.hour;
	}
	public void setMinute(int Minute) {
		this.minute = minute;
	}
	public int getMinute() {		
		return minute;
	}
	public void setSecond(int Second) {
		this.second = second;
	}
	public int getSecond() {		
		return this.second;
	}
	public static String toUniversal() {
		String newminute = "0";
		String newsecond = "0";
		if (minute < 10) {
			newminute += minute;
		}
		if(second < 10) {
			newsecond += second;
		}
		if(minute < 10 && second < 10) {
			return hour + ":" + newminute + ":" + newsecond;
		}
		else if(minute < 10) {
			return hour + ":" + newminute + ":" + second;
		}
		else if(second < 10) {
			return hour + ":" + minute + ":" + newsecond;
		}
		else {
			return hour + ":" + minute + ":" + second;
		}
				
			
	}
	
	public static String toStandard() {
		String newminute = "0";
		String newsecond = "0";
		String meridian = "";
		if (minute < 10) {
			newminute += minute;
		}
		if(second < 10) {
			newsecond += second;
		}
			
		if(hour > 12) {
			hour = hour - 12;
			meridian = "PM";			
		}
		else {
			meridian = "AM";
		}
			
		if(minute < 10 && second < 10) {
			return hour + ":" + newminute + ":" + newsecond + " " + meridian;
		}
		else if(minute < 10) {
			return hour + ":" + newminute + ":" + second + " " + meridian;
		}
		else if(second < 10) {
			return hour + ":" + minute + ":" + newsecond + " " + meridian;
		}
		else {
			return hour + ":" + minute + ":" + second + " " + meridian;
		}	
	}
	public void add(Time t) {
		int temp = 0;
		int newsecond = this.second + t.getSecond();
		if(newsecond > 60) {
			newsecond = newsecond - 60;
			temp = 1;
		}
		int newminute = this.minute + t.getMinute() + temp;
		temp = 0;
		if(newminute > 60) {
			
			newminute = newminute - 60;
			temp = 1;
		}
		int newhour = this.hour + t.getHour() + temp;
		if(newhour > 24) {
			newhour = newhour - 24;
		}
		
		this.hour = newhour;
		this.minute = newminute;
		this.second = newsecond;
	}
	
}
