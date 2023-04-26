
public class main {
	public static void main(String[] args) {
		int sum = add(4,2);
		System.out.println(add(5,2));
		System.out.println(sum);
		int sum2 = add(2, add(5,7));
		
		Elevator e1 = new Elevator();
		e1.floor = 5;
		
		e1.upAFloor();
		System.out.println(e1.floor);
		
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void test() {
		System.out.println("Hej!");
		System.out.println("Hej!");

	}
	
}
