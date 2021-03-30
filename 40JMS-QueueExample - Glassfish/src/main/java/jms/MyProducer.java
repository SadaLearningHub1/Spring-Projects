package jms;

import java.util.Hashtable;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MyProducer {

	public static void main(String[] args) throws NamingException, JMSException {
		Hashtable ht = new Hashtable();
		ht.put("java.naming.factory.initial", "com.sun.enterprise.naming.impl.SerialInitContextFactory");
		ht.put("java.naming.provider.url", "iiop://localhost:4848");
		Context ctx = new InitialContext(ht);
		QueueConnectionFactory qcf = (QueueConnectionFactory)ctx.lookup("jms/__defaultConnectionFactory");
		QueueConnection qc = qcf.createQueueConnection();
		QueueSession qs = qc.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		Queue q = (Queue)ctx.lookup("jms/__defaultQueue");
		QueueSender qsender = qs.createSender(q);
		TextMessage tm = qs.createTextMessage();
		tm.setText("This is my First message");
		qc.start();
		qsender.send(tm);
		System.out.println("Message Sent");
		System.exit(0);

	}

}
