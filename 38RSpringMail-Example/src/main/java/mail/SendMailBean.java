package mail;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class SendMailBean {
	private JavaMailSenderImpl mailSender;

	public void setMailSender(JavaMailSenderImpl mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendEmail() {
		try {
			SimpleMailMessage smm = new SimpleMailMessage();
			smm.setFrom("sada491@gmail.com");
			smm.setTo("sada491@gmail.com");
			smm.setSubject("Mail from spring application");
			smm.setText("This is a simple mail from spring mail application");
			mailSender.send(smm);
			System.out.println("Mail send successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
