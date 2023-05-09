package recursiveDemo;

public class main {

	public static void main(String[] args) {
		System.out.println(summa(4));  
		System.out.println(summa(10)); 
	}

	private static int summa (int N) {
	    // Hjälpvariabel
	    int sum; 
	    // Basfall
	    if (N == 1) { 
	        sum = 1;
	    }
	    else {
	        // Metoden anropar sig själv --> Rekursivt anrop
	        sum = N + summa(N - 1);  
	    }
	    //Returnera summan
	    return sum; 
	}
	
}
