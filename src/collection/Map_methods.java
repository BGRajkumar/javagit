package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_methods {
	public static void main(String[] args) {
		
		Map<Integer,Object> obj = new HashMap<>();
		//      key+ value
		obj.put(null, 5);
		obj.put(1, 10);
		obj.put(2, 20);
		obj.put(3, 30);
		obj.put(4, 40);
		obj.put(5, 50);
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		Object object = obj.get(2);
		System.out.println(object);
		Set<Integer> keySet = obj.keySet();
		System.out.println(keySet);
		Collection<Object> value = obj.values();
		System.out.println(value);
		boolean containsKey = obj.containsKey(4);
		System.out.println(containsKey);
	    boolean containsValue = obj.containsValue(40);
		System.out.println(containsValue);
		
		Set<Entry<Integer, Object>> entrySet = obj.entrySet();
		System.out.println(entrySet);
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
		}
		
	}

}
