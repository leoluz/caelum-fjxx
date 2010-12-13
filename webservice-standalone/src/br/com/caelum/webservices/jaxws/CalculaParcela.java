
package br.com.caelum.webservices.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calculaParcela", namespace = "http://webservices.caelum.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculaParcela", namespace = "http://webservices.caelum.com.br/", propOrder = {
    "arg0",
    "arg1"
})
public class CalculaParcela {

    @XmlElement(name = "arg0", namespace = "")
    private double arg0;
    @XmlElement(name = "arg1", namespace = "")
    private int arg1;

    /**
     * 
     * @return
     *     returns double
     */
    public double getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(double arg0) {
        this.arg0 = arg0;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getArg1() {
        return this.arg1;
    }

    /**
     * 
     * @param arg1
     *     the value for the arg1 property
     */
    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

}
