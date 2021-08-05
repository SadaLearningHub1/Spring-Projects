package com.sadalearninghub.RSpringJdkTimerService.task;

import org.springframework.stereotype.Component;

@Component
public class WorkerBean {
	public void doWork() {
		System.out.println("Hello World");
	}

}
