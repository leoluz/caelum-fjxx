package br.com.caelum.loja.session;

import javax.annotation.Resource;
import javax.ejb.EJBException;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

@Stateless
@Local(Mensageiro.class)
public class MensageiroBean implements Mensageiro {

	@Resource(mappedName="QueueConnectionFactory")
	private ConnectionFactory fabrica;
	
	@Resource(mappedName="fila-compras")
	private Queue queue;
	
	@Override
	public void enviaMensagem(String mensagem) {

		try {
			Connection connection = fabrica.createConnection();
			Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
			MessageProducer messageProducer = session.createProducer(this.queue);
			TextMessage textMessage = session.createTextMessage();
			textMessage.setText(mensagem);
			
			System.out.println("Vendas enviando: " + mensagem);
			
			messageProducer.send(textMessage);
			
			messageProducer.close();
			connection.close();

		} catch (JMSException e) {
			throw new EJBException(e);
		}
	}
}
