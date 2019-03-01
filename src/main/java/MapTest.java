import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(new Employee(1,"om",200).hashCode(), 12);
		map.put(new Employee(1,"om",200).hashCode(), 13);
		map.put(new Employee(1,"om",200).hashCode(), 14);
		
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
			
			System.out.println("key ======="+entry.getKey()+" value = "+entry.getValue());
			
			
		}
		
		
	}

}
