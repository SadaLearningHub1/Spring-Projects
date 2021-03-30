package task;

import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyTimerTask extends TimerTask{

	private WorkBean WorkBean;
	@Autowired
	@Qualifier("wb")
	public void setWorkBean(WorkBean workBean) {
		this.WorkBean = workBean;
	}
	
	@Override
	public void run() {
		WorkBean.sayHello();
		
	}

}
