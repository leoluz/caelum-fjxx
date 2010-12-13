
package br.com.caelum.cliente.testeisrael;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculaParcela complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculaParcela">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="qunatidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculaParcela", propOrder = {
    "valorTotal",
    "qunatidade"
})
public class CalculaParcela {

    protected double valorTotal;
    protected int qunatidade;

    /**
     * Gets the value of the valorTotal property.
     * 
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     */
    public void setValorTotal(double value) {
        this.valorTotal = value;
    }

    /**
     * Gets the value of the qunatidade property.
     * 
     */
    public int getQunatidade() {
        return qunatidade;
    }

    /**
     * Sets the value of the qunatidade property.
     * 
     */
    public void setQunatidade(int value) {
        this.qunatidade = value;
    }

}
