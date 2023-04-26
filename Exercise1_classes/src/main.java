

public class main {
	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		House house1 = new House();
		House house2 = new House();
		
		person1.name="Lars";
		person1.age=33;
		person1.gender="Male";
		person1.length=187;
		person1.occupation="Doctor";

		person2.name="Eva";
		person2.age=22;
		person2.gender="Female";
		person2.length=167;
		person2.occupation="Medic";
		
		person3.name="Melissa";
		person3.age=42;
		person3.gender="Unknown";
		person3.length=172;
		person3.occupation="Programmer";
		
		house1.area=120;
		house1.buildYear=1909;
		house1.floors=1;
		house1.value=1000000;
		house1.address.street="Storgatan";
		house1.address.streetNumber=34;
		house1.address.postalNumber=46791;
		house1.address.city="Grästorp";
		
		house2.area=230;
		house2.buildYear=1992;
		house2.floors=3;
		house2.value=2300000;
		house2.address.street="Kungsgqatan";
		house2.address.streetNumber=11;
		house2.address.postalNumber=46811;
		house2.address.city="Trollhättan";
		
		person1.house = house1;
		person2.house = house1;
		person3.house = house2;
		
		System.out.println(person1.name + " " + person1.house.address.street + " " + person1.house.address.streetNumber + " " + person1.house.address.postalNumber + " " + person1.house.address.city);
		System.out.println(person2.name + " " + person2.house.address.street + " " + person2.house.address.streetNumber + " " + person2.house.address.postalNumber + " " + person2.house.address.city);
		System.out.println(person3.name + " " + person3.house.address.street + " " + person3.house.address.streetNumber + " " + person3.house.address.postalNumber + " " + person3.house.address.city);

		
		Car car1 = new Car();
		car1.model = "Mitsubishi";
		car1.value = 200000;
		car1.kilometers = 160000;
		
		Car car2 = new Car();
		car2.model = "Subaru";
		car2.value = 130000;
		car2.kilometers = 10000;
		
		house1.car = car1;
		house2.car = car2;		
		
		System.out.println(person1.name + " " + person1.house.address.street + " " + person1.house.address.streetNumber + " " + person1.house.address.postalNumber + " " + person1.house.address.city);
		System.out.println(person1.house.car.model);
		System.out.println(person1.house.car.value);
		car1.decValue();
		System.out.println(person1.house.car.value);
		System.out.println(person1.age);
		person1.aging();
		System.out.println(person1.age);
	
		
		System.out.println(person2.name + " " + person2.house.address.street + " " + person2.house.address.streetNumber + " " + person2.house.address.postalNumber + " " + person2.house.address.city);
		System.out.println(person2.house.car.model);
		System.out.println(person3.name + " " + person3.house.address.street + " " + person3.house.address.streetNumber + " " + person3.house.address.postalNumber + " " + person3.house.address.city);
		System.out.println(person3.house.car.model);


		System.out.println(person1.house.value);
		person1.house.addValue();
		System.out.println(person1.house.value);
		
		System.out.println(person1.age);
		
		
		
		
		
	}	
}
