package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import scheduling.Printer;

@Configuration
@EnableScheduling
public class SchedulerConfiguration {
	@Bean
	public Printer printingTask() {
		return new Printer();
	}
}