package br.com.caelum.jms;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EnviaMensagemParaTopico {

	public static void main(String[] args) throws NamingException, JMSException {

		InitialContext ic = new InitialContext();
		TopicConnectionFactory topicConnectionFactory = (TopicConnectionFactory) ic.lookup("ConnectionFactory");
		TopicConnection topicConnection = topicConnectionFactory.createTopicConnection();
		TopicSession topicSession = topicConnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		TextMessage textMessage = topicSession.createTextMessage();
		textMessage.setText("Mensagem de texto para um Topic");
		textMessage.setStringProperty("noticia", "esporte");
		
		Topic topic = (Topic) ic.lookup("topico-teste");
		TopicPublisher publisher = topicSession.createPublisher(topic);
		publisher.publish(textMessage);
	}
}
