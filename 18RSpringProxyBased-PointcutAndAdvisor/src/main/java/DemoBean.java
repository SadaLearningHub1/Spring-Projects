

public class DemoBean implements Demo {

	@Override
	public void sayHello() {
		System.out.println("I am from sayHello() method");

	}

	@Override
	public void sayBye() {
		System.out.println("i am from sayBye() method");

	}

	@Override
	public String getMessage() {
		System.out.println("I am from getMessage() method");
		return "Hello AOP";
	}

	@Override
	public void welcoe() {
		System.out.println("I am from Welcome()");
	}
	

}
