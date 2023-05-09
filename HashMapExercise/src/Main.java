import java.util.HashMap;
import java.util.Scanner;

/*
 * 4) Skriv ett program där du först skapar en HashMap som har nycklar av typen Integer samt ett värde 
 * av typen String, dvs varje set ska vara av typen <Integer, String>. Nycklarna ska vara en siffra som 
 * motsvarar en längd i cm, och varje värde ska motsvara namn på en person.
Lägg sedan 5 set i HashMappen, där varje set ska ha en personslängd som nyckel samt personens namn som värde.

 *5) Utöka programmet från uppgift 3 så att det tar emot inmatning från användaren i form av ett heltal, 
 *och programmet ska sedan skriva ut namnet på personen som har den längden, om personen inte finns så ska detta skrivas ut
 * på skärmen. Inmatningen ska ske in en while-loop som terminerar om användaren matar in siffran 1000.

Ledtråd: metoden get i HashMap returnerar ett objekt om den angivne nyckeln i get mappar till det objeketet. 
Annars så returnerar metoden null. 
Allså om metoden reurnerar null, då betyder det att den nyckeln inte mappar till något värde i tabellen.
 */

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap <Integer, String>();
		hm.put(187, "Patrik");
		hm.put(172, "Helen");
		hm.put(145, "Oskar");
		hm.put(133, "Sabina");
		hm.put(13, "Molgan");
		
		int inp=0;
		Scanner sc = new Scanner(System.in);
				
		while(inp!=1000) {
			System.out.println("Enter a length: ");
			inp = sc.nextInt();
			if (inp!=1000) {
				String name = hm.get(inp);
				
				if (name != null) {
					System.out.println("Name: " + name);
				}
				else {
					System.out.println("No person that long in database.");
				}	
			}
		}
		System.out.println("Bye!");
	}

}
