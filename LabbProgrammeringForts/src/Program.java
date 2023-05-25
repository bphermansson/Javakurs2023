
public class Program {
	public static void main(String[] args) {
		Model myModel = new Model();
		/*
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
		System.out.println("Value from hashtable: " + h);		 
		System.out.println("Power 3: " + myModel.computePower(3));	// 8
		System.out.println("Power 5: " + myModel.computePower(5));	// 32
		System.out.println( "Power -2: " + myModel.computePower(-2));	// 0
		System.out.println("Power 15: " +  myModel.computePower(15));	// 32768
		System.out.println( "Power 25: " + myModel.computePower(25)); // 33554432
		System.out.println( "Power 0: " + myModel.computePower(0));	// 1
		System.out.println( "Power 1: " + myModel.computePower(1));	// 2
*/
		//System.out.println( "compute2Power -1: " + myModel.compute2Power(-1));
		System.out.println( "compute2Power 0 result: " + myModel.compute2Power(0));
		System.out.println( "compute2Power 1 result: " + myModel.compute2Power(1));
		System.out.println( "compute2Power 3 result: " + myModel.compute2Power(3));
		System.out.println( "compute2Power 5 result: " + myModel.compute2Power(5));
		System.out.println( "compute2Power 3 result: " + myModel.compute2Power(3));

		
	}
}
