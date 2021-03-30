
public class ProductImpl implements Product{

	@Override
	public void add(int x, int y) {
		System.out.println(" The addition : "+x+y);
		
	}

	@Override
	public int multiply(int x, int y) {
		return x*y;
	}

	@Override
	public void show() {
		System.out.println("I am from show method");
		
	}

}
