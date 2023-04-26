
public class main {
	public static void main(String[] args) {
		
		Clock c = new Clock();
		c.setHours(5);
		c.setMinutes(-20);
		c.setSeconds(23);
		
		c.setTime(0, 0, 0);
		while(true) {
			c.tick();
			c.printClock();	
		}
				
		
		/*
		Position p = new Position();
		p.setX(5);
		int px = p.getX();
		System.out.println(px);
		p.setPos(3, 2);
		px = p.getX();
		System.out.println(px);
		*/
	}
}
