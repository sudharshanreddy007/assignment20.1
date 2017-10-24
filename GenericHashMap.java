package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class GenericHashMap 

{
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//HashMap class implements the map interface by using a hash 
		//table. It inherits AbstractMap class and implements Map 
		//interface.HashMap<k,v>
		//K: It is the type of keys maintained by this map.
		//V: It is the type of mapped values.
		HashMap<Integer,String> employeeNames=new HashMap<Integer,String>();
		//put(K key, V value) method is used to associate the specified 
		//value with the specified key in this map.
		employeeNames.put(1,"sheetal");
		 employeeNames.put(2,"Mark");
		 employeeNames.put(3,"ambika");
		 employeeNames.put(4,"bran");
	
		System.out.println("Employees are:");
		
	//creating the values and iterating
		Iterator valueIterator= employeeNames.values().iterator();
//hasNext() method Returns true if this scanner has another token in its input. 
		while(valueIterator.hasNext())
		{
			System.out.println(valueIterator.next());	
			
		
		}
		  
	}

}