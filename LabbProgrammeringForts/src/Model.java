import java.util.HashMap;

public class Model {
	private HashMap<Integer, Long> cache = new HashMap<Integer, Long>();
	
	public  long getValue(Integer key) {
		if (key == (int)key && key > 0) {		// Is key an integer above zero?
			return getValueFromMemory(key);
		}
		else {
			throw new IndexOutOfBoundsException();	
		}
	}
	
	private  long getValueFromMemory(Integer key){
		long val = 0;
		try {
			val = cache.get(key);
		}
		catch (Exception e) {
			System.out.println("Invalid key! " + e);
		}		
		return val;
	}
	
	public void setValue(Integer key, Long value){
		// Check if key is used
		// Check if key & value is valid
		
		if (key == (int)key && key > 0) {		// Is key an integer above zero?
			if (cache.containsKey(key) || key<1||value==null) {
				System.out.println("Key already exists! ");
			}
			else {
				addValueToMemory(key, value);
			}
		}
	}
	
	private void addValueToMemory(Integer key, Long value){
		cache.put(key, value);
	}
	public void clearMemory(){
		cache.clear();
	}
	
	int res=2;
	int sum=2;

	//private long computePower(int power)  Ska vara private!
	public long computePower(int power) {
		//System.out.println("Loop" );
		if(power>1) {
			sum = sum * 2;
			//System.out.println(sum + " " + power);			
			power--;
			computePower(power);
		}
		else {
			res = sum;
			sum = 2;
			System.out.println("res  " + res);						
		}
		return res; 

			/*
			while(power>0) {
				res = res * res;
				power--;
				System.out.println("power:" + power);
					computePower(power);	
			}
			System.out.println("power=0");
		}
		System.out.println("res:" + res);
		System.out.println(summa(4));  
        return res;
*/
	}
	public long compute2Power(int power){
		return 0;
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
