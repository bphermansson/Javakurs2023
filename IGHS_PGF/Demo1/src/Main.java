
public class Main {

	public static void main(String[] args) {
		System.out.println("Hej");
		Person p = new Person();
		p.setInformation("Jon", 23, "Teacher");
		
		int a = p.getPerson().age;
		System.out.println(a);
		
		//System.out.println(p.name + " heter jag. " + p.age + " " + p.job);
		
		p.buyCar("Austin", 1985);
		p.printPerson();

		Person p2 = new Person();
		p2.setInformation("Lars", 33, "Musician");
		p2.buyCar("Saab", 2015);
		
		p2.printPerson();
		
		p.tradeCar(p2);
		p.printPerson();
		p2.printPerson();
		/*
		p.name = "Bo";
		p.age = 88;
		p.job="Teacher";
		System.out.println(p.name + " heter jag. " + p.age + " " + p.job);
		
		Person p2 = new Person();
		
		p2.name = "Bosse";
		p2.age = 44;
		p2.job="Singer";
		
		//System.out.println(p2.name + " heter jag. " + p2.age + " " + p2.job);
		
		p.friend = p2;
		
		System.out.println(p.friend.name + " är min vän. ");
			
		Car c = new Car();
		c.year = 2022;
		c.brand = "Mitsubishi";
		
		p.car = c;
		
		System.out.println(p.car.brand + " är min bil. ");
		*/
	}

}
