
public class ArthematicBean implements Arthematic {

	@Override
	public void division(int a, int b) {
		int c = a/b;
		System.out.println("Division : "+c);		
	}

	@Override
	public int multiply(int a, int b) {
		int c=a*b;
		try {
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

}
