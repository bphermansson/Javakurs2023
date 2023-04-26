
public class Person {
	public String name;
	public int age;
	public String job;
	public Person friend;
	public Car car;
	public Person person;
	
	public void setInformation(String n, int a, String j) {
		name = n;
		age = a;
		job = j;
	}
	public Person getPerson() {
		person = new Person();
		person.name = name;
		person.age = age;
		person.job = job;
		return person;
		
	}
	public void printPerson() {
		System.out.println(name + " heter jag. " + age + " " + job + " Bil: " + car.brand + car.year);
	}
	public void buyCar(String brand, int year) {
		car = new Car();
		car.brand = brand;
		car.year = year;
	}
	public void tradeCar(Person p) {
		Car temp;
		temp = p.car;
		p.car = car;
		car = temp;
	}
}
