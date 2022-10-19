package features.stream;

import java.util.Arrays;
import java.util.List;

public class Customer {

	private int id;
	private String name;
	private String email;
	private List<String> phoneNums;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNums() {
		return phoneNums;
	}

	public void setPhoneNums(List<String> phoneNums) {
		this.phoneNums = phoneNums;
	}

	public Customer(int id, String name, String email, List<String> phoneNums) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNums = phoneNums;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phoneNums=" + phoneNums + "]";
	}


}
