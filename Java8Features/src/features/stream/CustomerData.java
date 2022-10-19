package features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerData {

	public List<Customer> getCustomers() {
		List<Customer> custs = new ArrayList<Customer>();
		custs.add(new Customer(1, "Srinu", "srinu@gmail.com", Arrays.asList("4444444","33333333","8888888")));
		custs.add(new Customer(5, "Kiran", "Kiran@yahoo.com", Arrays.asList("2222222","555555555")));
		return custs;
	}

}
