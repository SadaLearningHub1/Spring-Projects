
public class DemoBean {
	private String msg;
	//setter injection And Dependency in the form of Simple
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void showMessage() {
		System.out.println(msg);
	}

}
