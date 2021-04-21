
public class Account implements Bank {

	@Override
	public void withdraw() {
		System.out.println("i am business method of withdraw");

	}

	@Override
	public void deposit() {
		System.out.println("i am business method of deposit");

	}

}
