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
		Properties p = new Properties();
		
		//properties for connecting with smpt mail server of james
		p.put("mail.smtp.host", "localhost");
		p.put("mail.smtp.port", "25");
		
		//getting a connection with smtp mail server of james
		Session s = Session.getInstance(p);
		
		//message creation
		Message m = new MimeMessage(s);
		m.setFrom(new InternetAddress("abcd@sadalearninghub.com"));
		m.setRecipient(Message.RecipientType.TO, new InternetAddress("xyz@sadalearninghub.com"));
		m.setSubject("This is subject1");
		m.setSentDate(new Date());
		m.setText("this is firstmail message");
		Transport t = s.getTransport("smtp");
		t.send(m);
		System.out.println("Mail delivered");
	}

}
