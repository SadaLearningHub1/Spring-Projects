
public class ProductImpl implements Product {

	@Override
	public void add(int x, int y) {
		System.out.println("The Addition: "+x+y);

	}

	@Override
	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

}
