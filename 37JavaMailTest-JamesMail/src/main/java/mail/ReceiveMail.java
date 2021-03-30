package mail;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

public class ReceiveMail {
	public static void main(String[] args) throws MessagingException, IOException {
		Properties p = new Properties();
		
		//properties of connecting pop mail server of james
		p.put("mail.pop.host", "localhost");
		p.put("mail.pop.port", "110");
		
		//getting a connection with pop mail server of james 
		Session ses = Session.getInstance(p);
		Store st = ses.getStore("pop3");
		st.connect("localhost","xyz@sadalearninghub.com","xyz");
		Folder mybox = st.getFolder("INBOX");
		mybox.open(Folder.READ_WRITE);
		Message m[] = mybox.getMessages();
		System.out.println("Total message : "+m.length);
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].getFrom());
			System.out.println(m[i].getContent());
			m[i].setFlag(Flags.Flag.DELETED, true);
		}
		mybox.close(true);
	}
}
