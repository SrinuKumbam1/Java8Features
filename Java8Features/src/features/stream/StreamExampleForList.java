package features.stream;

import java.util.Comparator;
import java.util.List;

import features.lamda.advance.EmpDao;
import features.lamda.advance.Employee;

public class StreamExampleForList {

	public static void main(String[] args) {
		List<Employee> emps = new EmpDao().getEmployees();
//		emps.stream().filter(e -> e.getSalary() >= 80000).forEach(e -> System.out.println(e));
//		emps.stream().sorted(Comparator.comparing(e -> e.getSalary())).forEach(e -> System.out.println(e));
		emps.stream().sorted(Comparator.comparing(Employee::getId)).forEach(e -> System.out.println(e));
	}

}
