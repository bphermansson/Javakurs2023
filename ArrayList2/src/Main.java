import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		
		printOut(list);

		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(3);
		intList.add(4);

		intList.add(5);
		intList.add(8);
		intList.add(7);
		
		boolean res = recurse(intList, 4, intList.size());
		System.out.println("res " + res);		
	}
	private static void printOut(ArrayList list) {
		for(int x=0; x<=list.size()-1; x++) {
			System.out.println(list.get(x));
		}
	}
	
	/*5. Skriv en rekursiv metod som tar emot två heltal där det första 
	är mindre eller lika med det andra. Metoden skriva alla heltal som ligger 
	mellan det minsta och det största talet. Skriv ett program som testar eran metod 
	genom att anropa den med några kombinationer av heltal.
	*/
	
	/*
	 * 3) Skriv om metoden i uppgift 5 i förre veckans övningsuppgifter så att metoden tar emot 
	 * en ArrayList av Integer samt en Integer istället för en array av int och en int.
		Tips: För att kolla om två Integer, i1, i2 är lika, ni kan använda 
		equals metoden: i1.equals(i2). Metoden returnerar true om de är lika, 
		annars false.
	 */
	
	private static boolean recurse(ArrayList<Integer> aList, Integer y, int index) {
		if(index>0) {
			//if(aList.get(index).equals(y)) {
			if(aList.get(index-1) < y) {
				return true;
			}
			else {
				System.out.println(index + "-" + aList.get(index));
				index--;
				recurse(aList, y, index);
			}
		}
		return false;		
	}
}
