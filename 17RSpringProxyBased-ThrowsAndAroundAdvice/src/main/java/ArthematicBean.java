
public class ArthematicBean implements Arthematic {

	@Override
	public void dividion(int a, int b) {
		int c = a/b;
		System.out.println("Dividion : "+c);

	}

	@Override
	public int multiply(int a, int b) {
		int c = a*b;
		try {
			Thread.sleep(50000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

}
