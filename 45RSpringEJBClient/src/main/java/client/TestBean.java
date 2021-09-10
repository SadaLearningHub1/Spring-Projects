package client;

import service.DemoInter;

public class TestBean {
	private DemoInter demoInter;

	public void setDemoInter(DemoInter demoInter) {
		this.demoInter = demoInter;
	}
	public void bm() {
		try {
			System.out.println(demoInter.sayHello("Rajesh"));
			System.out.println(demoInter.sayBye("Rajesh"));
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
