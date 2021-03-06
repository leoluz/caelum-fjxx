package br.com.caelum.fj31.jaxb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class TesteMarshal {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		Produto produto = new Produto();
		produto.setNome("bola");
		produto.setDescricao("Uma bola");
		produto.setPreco(100);
		
		Categoria categoria = new Categoria();
		categoria.setNome("capotão");
		
		produto.setCategoria(categoria);
		
		JAXBContext context = JAXBContext.newInstance(Produto.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(produto, new FileOutputStream("bola.xml"));
	}
}
