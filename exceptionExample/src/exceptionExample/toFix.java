package exceptionExample;

public class toFix {

	public static void toFix() {
		int[] numberList1 = null; // tom lista
		int[] numberList2 = {2, 5, 10, -5, 10};

		try {
			//System.out.println("50 exists in numbersList1: " + searchNumber(numberList1, 50)); //Borde returnera false
			System.out.println("-5 exists in numbersList2: " + searchNumber(numberList2, -5)); //Borde returnera true	
		}
		catch (NullPointerException e){
			System.out.println("Error: " + e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: " + e);
		}
		

		}

	private static boolean searchNumber(int[] list, int number){
		
		if ( list != null) {
			for(int i=-1;i<=list.length;i++){
				if (list[i] == number)
					return true;
			}
			return false;	
		}
		else {
			throw new NullPointerException();
		}
		
	}	
}
