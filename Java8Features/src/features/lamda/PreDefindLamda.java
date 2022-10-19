package features.lamda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefindLamda {

	public static void main(String[] args) {
		Consumer<String> con = s -> System.out.println(s);
		con.accept("Consumer Lamda Expression");
		
		Predicate<Integer> pre = t -> t % 2 == 0;
		System.out.println("Using Predicate "+pre.test(9));
		
		Supplier<Integer> sup = () -> 8;
		System.out.println("Using Supplier "+sup.get());
	}
}
