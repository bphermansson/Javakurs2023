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
		System.out.println("Add value to memory");
		
		if (key == (int)key && key >= 0 && value == (Long)value && value>=0) {		// Is key an integer above zero? Value a long above zero?
			if (cache.containsKey(key) ) {
				System.out.println("Key already exists! ");
			}
			else {
				addValueToMemory(key, value);
			}
		}
	}
	
	private void addValueToMemory(Integer key, Long value){
		System.out.println("Add: " + key + " - " + value);
		cache.put(key, value);
	}
	public void clearMemory(){
		cache.clear();
		System.out.println("Cleared, full list: " + cache);
	}
	
	int res=2;
	int sum=2;

	public long computePower(int power) {
		if(power>=0) {
			return (computePowerInternal(power));
		}
		else {
			System.out.println("Invalid power value: " + power);
			return 0;
		}
	}
	
	private long computePowerInternal(int power) {
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
			isPowerLessThanZero(power);
			System.out.println("Add computed value. Power value ok: " + power );
			key = power;
			
			if (cache.containsKey((int)key) ) {
				System.out.println("Value already exists!");
				val = getValue((int)key);
			}
			else {
				val = computePower(power);
				System.out.println("New val: " + val + ", key: " + key);
				setValue((int)key, val);
			    System.out.println("Memory contains: " + cache);	
			}
			
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error " + e );
			val = -1;
		}
		return val;
	}			
	
	private void isPowerLessThanZero(int power) {
		if (power<0) {
			throw new IllegalArgumentException();
		}
	}
}
