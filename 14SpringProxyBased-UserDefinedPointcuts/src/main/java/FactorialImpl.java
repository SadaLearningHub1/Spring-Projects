
public class FactorialImpl implements Factorial{

	@Override
	public void findFactorial(int x) {
		if(x<0) {
			System.out.println("parameter is Nagative");
			return;
		}
		int fact=1;
		for(int i=1; i<=x;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of :" +x+" is : "+fact);
		
	}

}
