package mail;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

public class SendMailBean {
	private JavaMailSenderImpl mailSender;

	public void setMailSender(JavaMailSenderImpl mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendEmail() {
		try {
			MimeMessage msg = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(msg,true);
			helper.setFrom("sada491@gmail.com");
			helper.setTo("sada491@gmail.com");
			helper.setText("This is a simple mail from spring mail application");
			helper.setSubject("Mail from spring application");
			FileSystemResource fsr = new FileSystemResource(new File("c:/duke.gif"));
			helper.addAttachment("duke.gif", fsr);
			this.mailSender.send(msg);
			System.out.println("Mail send successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
