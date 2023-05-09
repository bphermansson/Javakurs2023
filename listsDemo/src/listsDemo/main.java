package listsDemo;
import java.util.ArrayList;
import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("List contains: " + list.toString());
		list.add(5);
		list.add(16);
		list.add(-25);
		System.out.println("List contains: " + list.toString());
		list.add(1, 3);
		System.out.println("List size: " + list.size());
		System.out.println("List contains: " + list.toString());
		list.remove(0);
		System.out.println("List contains: " + list.toString());
		System.out.println("List contains an item: " + list.get(2));
		System.out.println("List size: " + list.size());
		list.clear();
		System.out.println("List cleared: " + list.toString());

		HashMap<String, String> phonebook = new HashMap<String, String>();
		phonebook.put("0708682705", "Patrik");
		phonebook.put("0708681111", "Peter");
		System.out.println("Phonebook1: " + phonebook.toString());
		
		System.out.println(phonebook.get("0708682705"));
		System.out.println(phonebook.get("0708682725"));
		System.out.println(phonebook.get("Peter"));	// You can only get/search with the phone number
		System.out.println(phonebook.get("Patrik"));
		System.out.println();
		phonebook.remove("0708682705");
		System.out.println(phonebook.get("0708682705"));
		System.out.println("Phonebook2: " + phonebook.toString());
		System.out.println("Phonebook size: " + phonebook.size());
		phonebook.clear();
		System.out.println("Phonebook: " + phonebook.toString());
	}
}
