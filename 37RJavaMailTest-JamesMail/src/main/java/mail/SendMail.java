package mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public static void main(String[] args) throws AddressException, MessagingException {

		//Properties for connecting with SMTP mail server of James
		Properties p = new Properties();
		p.put("mail.transport.protocol", "smpt");
		p.put("mail.smtp.auth", true);
		p.put("mail.smtp.port", 465);
		p.put("mail.smtp.socketFactory.port", 465);
		p.put("mail.smtp.socketFactory.class", "avax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.socketFactory.fallback", false);
		p.put("mail.smtp.quitwait", false);
		p.put("mail.smtp.starttls.enable", true);
		
		//getting the connection with SMTP mail server of James
		Session session = Session.getInstance(p);
		
		//Message creation
		Message m = new MimeMessage(session);
		m.setFrom(new InternetAddress("abc"));
		m.setRecipient(Message.RecipientType.TO, new InternetAddress("xyz"));
		m.setSubject("This is from James Mail server");
		m.setSentDate(new Date());
		m.setText("This is First Mail from James");
		
		Transport t = session.getTransport("smtp");
		t.send(m);
		
		System.out.println("Mail got Delivered");
		
		//Close Session
		session.getClass();
	}

}
