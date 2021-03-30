import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import bean.SchedulerConfiguration;

public class AppMain {
	public static void main(String args[]){
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(SchedulerConfiguration.class);
	}

}
