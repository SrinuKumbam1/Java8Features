package features.lamda.advance;

import java.util.Collections;
import java.util.List;

public class EmployeeService {

	public static void main(String[] args) {
		System.out.println(new EmployeeService().getSortedEmplooyes());
	}

	public List<Employee> getSortedEmplooyes(){
		List<Employee> emps = new EmpDao().getEmployees();
		Collections.sort(emps, 	(o1, o2) -> o1.getId().compareTo(o2.getId()));
		return emps;
	}
}
