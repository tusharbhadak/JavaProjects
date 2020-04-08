
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEmployee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="empno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEmployee", propOrder = {
    "empno",
    "ename",
    "sal"
})
public class UpdateEmployee {

    protected int empno;
    protected String ename;
    protected double sal;

    /**
     * Gets the value of the empno property.
     * 
     */
    public int getEmpno() {
        return empno;
    }

    /**
     * Sets the value of the empno property.
     * 
     */
    public void setEmpno(int value) {
        this.empno = value;
    }

    /**
     * Gets the value of the ename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEname() {
        return ename;
    }

    /**
     * Sets the value of the ename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEname(String value) {
        this.ename = value;
    }

    /**
     * Gets the value of the sal property.
     * 
     */
    public double getSal() {
        return sal;
    }

    /**
     * Sets the value of the sal property.
     * 
     */
    public void setSal(double value) {
        this.sal = value;
    }

}
