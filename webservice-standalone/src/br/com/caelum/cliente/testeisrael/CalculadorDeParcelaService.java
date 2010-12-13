
package br.com.caelum.cliente.testeisrael;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_02-b08-fcs
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "CalculadorDeParcelaService", targetNamespace = "http://webservices.caelum.com.br/", wsdlLocation = "http://192.168.126.111:10000/calculadroDeParcela?wsdl")
public class CalculadorDeParcelaService
    extends Service
{

    private final static URL CALCULADORDEPARCELASERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://192.168.126.111:10000/calculadroDeParcela?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        CALCULADORDEPARCELASERVICE_WSDL_LOCATION = url;
    }

    public CalculadorDeParcelaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculadorDeParcelaService() {
        super(CALCULADORDEPARCELASERVICE_WSDL_LOCATION, new QName("http://webservices.caelum.com.br/", "CalculadorDeParcelaService"));
    }

    /**
     * 
     * @return
     *     returns CalculadorDeParcela
     */
    @WebEndpoint(name = "CalculadorDeParcelaPort")
    public CalculadorDeParcela getCalculadorDeParcelaPort() {
        return (CalculadorDeParcela)super.getPort(new QName("http://webservices.caelum.com.br/", "CalculadorDeParcelaPort"), CalculadorDeParcela.class);
    }

}