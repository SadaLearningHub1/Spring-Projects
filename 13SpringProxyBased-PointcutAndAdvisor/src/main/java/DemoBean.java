
public class DemoBean implements Demo{

	@Override
	public void sayHello() {
		System.out.println("I am from say Hello");
		
	}

	@Override
	public void sayBye() {
		System.out.println("I am from Say Bye");
		
	}

	@Override
	public String getMesssage() {
		System.out.println("I am from get message");
		return null;
	}

	@Override
	public void welcome() {
		System.out.println("I am from welcome");
		
	}

}
