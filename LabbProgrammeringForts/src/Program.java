
public class Program {
	public static void main(String[] args) {
		Model myModel = new Model();
		try {
			long h = myModel.getValue(2);
		}
		catch (Exception e) {
			System.out.println("Error: " + e);	
		}
		
		myModel.setValue(1, (long)213);
		myModel.setValue(2, (long)3);
		myModel.setValue(3, (long)23);
		
		long h = myModel.getValue(2);
		System.out.println("Value: " + h);
		
		long power_sum = myModel.computePower(3);
		System.out.println(power_sum);
		System.out.println( myModel.computePower(5));
		System.out.println( myModel.computePower(15));
		
	}
}
