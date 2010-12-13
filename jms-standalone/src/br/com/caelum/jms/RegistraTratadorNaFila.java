package br.com.caelum.jms;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RegistraTratadorNaFila {

	public static void main(String[] args) throws NamingException, JMSException {
		InitialContext ic = new InitialContext();
		QueueConnectionFactory queueConnectionFactory = (QueueConnectionFactory) ic.lookup("ConnectionFactory");
		
		QueueConnection queueConnection = queueConnectionFactory.createQueueConnection();
		QueueSession queueSession = queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		Queue queue = (Queue) ic.lookup("fila-teste");
		QueueReceiver queueReceiver = queueSession.createReceiver(queue);
		queueReceiver.setMessageListener(new TratadorDeMensagem());
		
		queueConnection.start();
		
	}
}
