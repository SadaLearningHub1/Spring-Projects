package client;

public class TestBean {
	private service.DemoInter demoInter;
	public void setDemoInter(service.DemoInter demoInter) {
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
