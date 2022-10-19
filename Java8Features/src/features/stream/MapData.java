package features.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import features.lamda.advance.Employee;

public class MapData {

	public Map<String, Integer> getMapData(){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("MI", 1);
		map.put("CSK", 2);
		map.put("SRH", 3);
		map.put("RCB", 4);
		map.put("DC", 5);
		map.put("RR", 6);
		map.put("PBK", 7);
		map.put("KKR", 1);
		
		return map;
	}
	
	public Map<Employee, Integer> getEmpMapData(){
		Map<Employee, Integer> empMap = new HashMap<Employee, Integer>();
		empMap.put(new Employee(10, "Srinu", 50000), 6);
		empMap.put(new Employee(17, "Kiran", 75000), 1);
		empMap.put(new Employee(13, "tarak", 40000), 9);
		empMap.put(new Employee(19, "Goud", 60000), 5);
		return empMap;
	}
}
