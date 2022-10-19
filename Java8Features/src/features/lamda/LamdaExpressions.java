package features.lamda;

public class LamdaExpressions {

	public static void main(String[] args) {
//		MyFunctional myFun = () -> System.out.println("Lamda Expression");
//		myFun.print();
//		MyFunctional myFun = (message) -> System.out.println(message);
//		myFun.show("Parameter Lamda function");
		MyFunctional myFun = () -> "Return Functional from Lamda";
		System.out.println(myFun.returnFun());
	}

//	@Override
//	public void print() {
//		System.out.println("Lamda Expression");
//		
//	}

}
