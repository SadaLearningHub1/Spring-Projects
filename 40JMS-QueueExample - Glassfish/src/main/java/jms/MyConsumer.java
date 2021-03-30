package jms;

import java.util.Hashtable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MyConsumer implements MessageListener {
	public MyConsumer() throws NamingException, JMSException {
		Hashtable ht = new Hashtable();
		ht.put("java.naming.factory.initial", "com.sun.enterprise.naming.impl.SerialInitContextFactory");
		ht.put("java.naming.provider.url", "iiop://localhost:4848");
		Context ctx = new InitialContext(ht);
		QueueConnectionFactory qcf = (QueueConnectionFactory)ctx.lookup("jms/__defaultConnectionFactory");
		QueueConnection qc = qcf.createQueueConnection();
		QueueSession qs = qc.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		Queue q = (Queue)ctx.lookup("jms/__defaultQueue");
		QueueReceiver qr = qs.createReceiver(q);
		qc.start();
		qr.setMessageListener(this);
	}
	
	public void onMessage(Message m) {
		try {
			if(m instanceof TextMessage) {
				TextMessage tm = (TextMessage)m;
				System.out.println(tm.getText());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws NamingException, JMSException {
		new MyConsumer();
	}

}
