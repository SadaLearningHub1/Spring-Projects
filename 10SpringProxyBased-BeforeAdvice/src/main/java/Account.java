/**
 * 
 */

/**
 * @author Sadha
 *
 */
public class Account implements Bank{

	@Override
	public void withdraw() {
		System.out.println("I am from Withdraw method");		
	}

	@Override
	public void deposit() {
		System.out.println("I am from deposit method");		
	}

}
