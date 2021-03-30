
public class ExampleBean1 {
	private ExampleBean2 eb2;
	private int k;
	public void setEb2(ExampleBean2 eb2) {
		this.eb2 = eb2;
	}
	public void setK(int k) {
		this.k = k;
	}
	public void show1() {
		String str=eb2.m1();
		System.out.println(str);
	}
	public void show2() {
		System.out.println("k= "+k);
	}

}
