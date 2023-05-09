
public class main {

	public static void main(String[] args) {
		int[] list = {3,2,4,6,3,7};
		int toSearchFor = 1;
		boolean isItThere = searcher(list, toSearchFor);
		System.out.println("Result for " + toSearchFor + ":" + isItThere);
		System.out.println("Result for " + 2 + ":" + searcher(list, 2));
	}
	private static boolean searcher(int[] list, int toFind) {
		for(int i = 0 ; i<=list.length-1 ; i++) {
			if(list[i] == toFind) {
				return true;
			}
		}
		return false;
	}
}
