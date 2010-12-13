package br.com.caelum.loja.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.session.GerenciadorLoja;

public class ClientGerenciadorLojaJAAS {

	public static void main(String[] args) throws NamingException {
		Properties env = new Properties();
		env.setProperty(Context.SECURITY_PRINCIPAL, "maria");
		env.setProperty(Context.SECURITY_CREDENTIALS, "pass");
		env.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.security.jndi.JndiLoginInitialContextFactory");
		
		InitialContext ic = new InitialContext(env);
		GerenciadorLoja gerenciadorLoja = (GerenciadorLoja) ic.lookup("fj31-loja-ear/GerenciadorLojaBean/remote");
		System.out.println(gerenciadorLoja.listaLivros());
		
	}
}
