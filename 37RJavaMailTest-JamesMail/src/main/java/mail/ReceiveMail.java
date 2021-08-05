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
		
		Properties prop = new Properties();
		prop.put("mail.pop.host", "localhost");
		prop.put("mail.pop.port", "110");
		
		
		//getting a connection with pop mail server of James
		Session session = Session.getInstance(prop);
		Store st = session.getStore("pop3");
		st.connect("localhost", "xyz", "xyz");
		
		Folder mybox = st.getFolder("INBOX");
		
		mybox.open(Folder.READ_WRITE);
		
		Message m[] = mybox.getMessages();
		
		System.err.println("Total Messages: "+m.length);
		
		for(int i=0;i<m.length; i++) {
			System.err.println(m[i].getFrom());
			System.out.println(m[i].getContent());
			System.out.println(m[i].getSubject());
			m[i].setFlag(Flags.Flag.DELETED, true);
		}
		
		mybox.close(true);		
	}
}
