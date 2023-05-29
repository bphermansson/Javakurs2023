import java.util.HashMap;

public class Model {
	private HashMap<Integer, Long> cache = new HashMap<Integer, Long>();
	
	private  long getValueFromMemory(Integer key){
		long val = 0;
		try {
			if (key == (int)key && key >= 0) {		// Is key an integer above zero?
				val = cache.get(key);
			}
			else {
				throw new IndexOutOfBoundsException();	
			}	
		}
		catch (Exception e) {
			System.out.println("Invalid key! " + e);
		}		
		finally {
			return val;	
		}
	}

	private void addValueToMemory(Integer key, Long value){
		System.out.println("Add: " + key + " - " + value);
		if (key == (int)key && key >= 0 && value == (Long)value && value>=0) {		// Is key an integer above zero? Value a long above zero?
			if (cache.containsKey(key) ) {
				System.out.println("Key already exists! ");
			}
			else {
				cache.put(key, value);
			}
		}
	}
	
	public void clearMemory(){
		cache.clear();
		System.out.println("Memory cleared, full list: " + cache);
	}
	
	int res=2;
	int sum=2;

	private long computePower(int power) {
		if(power>1) {
			sum = sum * 2;			
			power--;
			computePower(power);
		}
		else if (power == 1) {
			// Special case, power of 1 doesn't do anything.
			res = sum;
			sum = 2;
		}
		else if (power == 0) {
			// Special case, power of 0 is 1.
			res = 1;
			sum = 2;
		}
		else {
			res = sum;
			sum = 2;
		}
		return res; 
	}
	public long compute2Power(int power){
		// Let power be the key, and the result the value
		long key = 0, val = 0;
		try {
			if (power<0) {
				throw new IllegalArgumentException();
			}		
			System.out.println("Power value ok: " + power );
			key = power;
			
			if (cache.containsKey((int)key) ) {
				System.out.println("Value already exists!");
				val = getValueFromMemory((int)key);
			}
			else {
				val = computePower(power);
				System.out.println("New value added: " + val + ", key: " + key);
				addValueToMemory((int)key, val);
			}
		    System.out.println("Memory contains: " + cache);				
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error " + e );
			val = -1;
		}
		return val;
	}			
}
