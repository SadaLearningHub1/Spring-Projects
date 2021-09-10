package client;

import service.DemoInter;

public class TestBean {
	private DemoInter demoInter;

	public void setDemoInter(DemoInter demoInter) {
		this.demoInter = demoInter;
	}
	public void bm() {
		try {
			String msg = demoInter.sayHello("Rajesh");
			System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
