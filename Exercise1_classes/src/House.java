

public class House {
	int area;
	
	//antal våningar, värde, byggnadsår och en adress.
	int floors;
	int value;
	int buildYear;
	HouseAddress address = new HouseAddress(); 
	Car car;
	
	void addValue() {
		value+=1000;
	}
}

