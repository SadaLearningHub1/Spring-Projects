package com.sadalearninghub.RSpringJdkTimerService.task;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class RunMyJob extends QuartzJobBean{
	
	private WorkerBean workerBean;
	
	@Autowired
	@Qualifier("wb")
	public void setWorkerBean(WorkerBean workerBean) {
		this.workerBean = workerBean;
	}

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		workerBean.doWork();
	}

}
