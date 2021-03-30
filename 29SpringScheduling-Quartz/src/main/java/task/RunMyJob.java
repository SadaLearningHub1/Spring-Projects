package task;



import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;

@Service
public class RunMyJob extends QuartzJobBean{

	private WorkBean WorkBean;
	@Autowired
	@Qualifier("wb")
	public void setWorkBean(WorkBean workBean) {
		this.WorkBean = workBean;
	}
	
	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		WorkBean.doWork();
		
	}

}
