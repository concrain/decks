
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessIdTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accessId",
    "accessIdTypeCd"
})
@XmlRootElement(name = "GetAccessIdentEntityAssoc")
public class GetAccessIdentEntityAssoc {

    protected String accessId;
    protected String accessIdTypeCd;

    /**
     * Gets the value of the accessId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessId() {
        return accessId;
    }

    /**
     * Sets the value of the accessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessId(String value) {
        this.accessId = value;
    }

    /**
     * Gets the value of the accessIdTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessIdTypeCd() {
        return accessIdTypeCd;
    }

    /**
     * Sets the value of the accessIdTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessIdTypeCd(String value) {
        this.accessIdTypeCd = value;
    }

}
