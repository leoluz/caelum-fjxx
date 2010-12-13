package br.com.caelum.fj26;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import br.com.caelum.fj26.model.CNPJ;

public class CNPJConverter implements Converter {
	
	private static Pattern pattern = Pattern.compile("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}");

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {

		if (pattern.matcher(value).find()) {
			CNPJ cnpj = new CNPJ();
			cnpj.setCnpj(value);
			return cnpj;
		}
		throw new ConverterException(new FacesMessage("Nao foi possivel converter o valor: " + value));
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object cnpj) {
		return ((CNPJ)cnpj).getCnpj();
	}
}
