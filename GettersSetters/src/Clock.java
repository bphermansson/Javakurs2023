
public class Clock {
	private int seconds;
	private int minutes;
	private int hours;
	
	public void tick() {
		setSeconds(seconds+1);
	}
	
	public void setHours(int h) {
		if(h >= 0 && h <= 23) {
			hours = h;
		}
		else {
			hours = h % 24;
		}
	}
	public void setMinutes(int m) {
		if(m >= 0 && m <= 59) {
			minutes = m;
		}
		else {
			minutes = m % 60;
			setHours(hours + m/60);
		}
	}
	
	public void setSeconds(int s) {
		if(s >= 0 && s <= 59) {
			seconds = s;
		}
		else {
			seconds = s % 60;	// Det som blir över. Om s är 85 blir detta 25
			setMinutes(minutes + s/60); 	// Heltalsdivision, 85/60 = 1
		}
	}
	
	public void setTime(int h, int m, int s) {
		setHours(h);
		setMinutes(m);
		setSeconds(s);
	}
	
	public int getSeconds() {
		return seconds;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getHours() {
		return hours;
	}
	
	
	
	public void printClock() {
		System.out.println(hours+":"+minutes+":"+seconds);
		
	}
	
}
