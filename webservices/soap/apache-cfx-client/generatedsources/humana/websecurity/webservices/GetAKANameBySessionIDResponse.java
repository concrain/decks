
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetAKANameBySessionIDResult" type="{urn:Humana:WebSecurity:WebServices}Session" minOccurs="0"/>
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
    "getAKANameBySessionIDResult"
})
@XmlRootElement(name = "GetAKANameBySessionIDResponse")
public class GetAKANameBySessionIDResponse {

    @XmlElement(name = "GetAKANameBySessionIDResult")
    protected Session getAKANameBySessionIDResult;

    /**
     * Gets the value of the getAKANameBySessionIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getGetAKANameBySessionIDResult() {
        return getAKANameBySessionIDResult;
    }

    /**
     * Sets the value of the getAKANameBySessionIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setGetAKANameBySessionIDResult(Session value) {
        this.getAKANameBySessionIDResult = value;
    }

}
