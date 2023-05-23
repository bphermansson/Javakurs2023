package exceptionExample;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = null;
		try {
			//printOut(list);	
		}
		catch (NullPointerException e){
			System.out.println("Error " + e );
			System.exit(1);
		}
				
		list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		
		try {
			printOut(list);	
		}
		catch (NullPointerException e){
			System.out.println("Error " + e );
			System.exit(1);
		}		
		
		toFix.toFix();

	}
	private static void printOut(ArrayList list) {
		if (list != null ) {
			for(int x=0; x<=list.size()-1; x++) {
				System.out.println(list.get(x));
			}	
		}
		else {
			throw new NullPointerException();
		}
	}
}
