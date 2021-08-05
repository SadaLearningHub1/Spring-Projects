package com.sadalearninghub.RSpringJdkTimerService.task;

import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyTimerTask extends TimerTask{
	
	private WorkBean workBean;
	
	@Autowired
	@Qualifier("wb")
	public void setWorkBean(WorkBean workBean) {
		this.workBean = workBean;
	}

	@Override
	public void run() {
		workBean.doWork();
		
	}

}
