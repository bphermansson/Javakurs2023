package recursiveExercise;

public class main {

	public static void main(String[] args) {
		recurse(2,8);
		recurse(1,18);
		recurse(12,8);
	}
	private static void recurse(int x, int y) {

		if(y>x) {
			System.out.println(y);
			y--;
			recurse(x,y);
		}
		else {
			System.out.println("Done");
		}
		if (x>y) {
			System.out.println("Check numbers, x should be <= y");
			System.exit(1);
		}
	}
}
