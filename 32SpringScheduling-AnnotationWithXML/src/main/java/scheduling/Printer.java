package scheduling;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("printer")
public class Printer {
 
 @Scheduled(fixedRate=3000)
    public void print() {
        System.out.println("Executed Printing Job..." + new Date());        
    }
}