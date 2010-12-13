package br.com.caelum.fj31.jaxb;

import java.io.IOException;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;


public class TesteSAAJ {

	public static void main(String[] args) throws SOAPException, IOException {
		
		MessageFactory factory = MessageFactory.newInstance();
		SOAPMessage message = factory.createMessage();
		SOAPBody body = message.getSOAPBody();
		QName name = new QName("http://webservices.caelum.com.br", "calculaParcela", "ns2");
		SOAPBodyElement element = body.addBodyElement(name);
		SOAPElement valorTotal = element.addChildElement(new javax.xml.namespace.QName("valorTotal"));
		valorTotal.setValue("2");
		message.writeTo(System.out);
		
	}
}
