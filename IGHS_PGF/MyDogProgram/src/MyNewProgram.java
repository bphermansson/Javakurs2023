
public class MyNewProgram {

	public static void main(String[] args) {
		System.out.println("Hej");
		Dog d = new Dog();
		Dog d2 = new Dog();
		d.age = 12;
		d.name="Lasse";
		d.breed="Pudel";
		
		d2.name ="Lisa";
		
		d2.mother = d;
				
		
		System.out.println(d.age);
	}

}
