
public class DemoImpl implements Demo{

	@Override
	public void businessMethod1(int amount) throws Exception {
		if(amount <= 0)
			throw new InsufficientAmountException("You have given amount : "+amount+" is invalid");
		else
			System.out.println("Amount is : "+amount+" it is valid");
	}

	@Override
	public void businessMethod2() {
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
		}
		
	}

	@Override
	public void before() {
		System.out.println("Before Advice Service");
		
	}

	@Override
	public String afterReturning() {
		System.out.println("After returning advice Service");
		return null;
	}

}
