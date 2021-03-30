package client;

import service.DemoInter;

public class TestBean {
	private DemoInter demoInter;
	public void setDemoInter(DemoInter demoInter) {
		this.demoInter = demoInter;
	}
	public void businessMethod() {
		try {
			String msg = demoInter.sayHello("SadaLearningHub");
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
