package features.lamda.advance;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {

	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Srinu", 80000));
		employees.add(new Employee(15, "Kiran", 85000));
		employees.add(new Employee(14, "Goud", 90000));
		employees.add(new Employee(18, "Vasu", 70000));
		
		return employees;
	}
}
