package features.lamda;

@FunctionalInterface
public interface MyFunctional {

	//public void print();
	
	//public void show(String message);
	
	public String returnFun();
	default void deafultMethod() {
		System.out.println("Default method");
	}
	
	public static void staticMethod() {
		System.out.println("Static function");
	}
}
