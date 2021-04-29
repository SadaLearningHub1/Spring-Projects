
public class FactorialImpl implements Factorial {

	@Override
	public void findFactorial(int x) {
		if(x<0) {
			System.out.println("Parameter is negative");
			return;
		}
		int fact=1;
		for(int i=1;i<=x;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of a given number is : "+fact);

	}

	@Override
	public void hello() {
		System.out.println("I am from Hello Method");
		
	}

}
