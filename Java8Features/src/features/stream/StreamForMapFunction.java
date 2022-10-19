package features.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForMapFunction {

	public static void main(String[] args) {
	
		List<Customer> customers = new CustomerData().getCustomers();
		
		List<String> emails = customers.stream().map(c -> c.getEmail()).collect(Collectors.toList());
//		customers.stream().map(c -> c.getEmail()).forEach(e -> System.out.println(e));
		System.out.println(emails);
		
//		List<List<String>> phones = customers.stream().map(c -> c.getPhoneNums()).collect(Collectors.toList());
		List<String> phones = customers.stream().flatMap(c -> c.getPhoneNums().stream()).sorted().collect(Collectors.toList());
		System.out.println(phones);
	
	}

}
