
public class DemoImpl implements Demo {

	@Override
	public void businessMethod1(Integer amount) throws Exception {
		if(amount <= 0) {
			throw new InSufficientException("UI have given amount: "+amount+" is invalid");
		}else {
			System.out.println("Amount is: "+amount+" is valid");
		}

	}

	@Override
	public void businessMethod2() {
		try {
			System.out.println("i am from business method2");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
