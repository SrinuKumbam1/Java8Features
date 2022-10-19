package features.stream;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import features.lamda.advance.Employee;

public class StreamExampleForMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new MapData().getMapData();
		
//		map.entrySet().stream().sorted(Entry.comparingByKey()).forEach(m -> System.out.println(m));
//		System.out.println("======================");
//		map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(m -> System.out.println(m));
		
		Map<Employee, Integer> empMap = new MapData().getEmpMapData();
		
//		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(m -> System.out.println(m));
		empMap.entrySet().stream()
							.filter(e -> e.getKey().getSalary() >= 50000)
							.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)
									.reversed()))
							.forEach(m -> System.out.println(m));
	
	}

}
