
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestGetAttributesForUser;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestGetAttributesForUser" minOccurs="0"/>
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
    "requestGetAttributesForUser"
})
@XmlRootElement(name = "GetAttributesForUser")
public class GetAttributesForUser {

    @XmlElement(name = "RequestGetAttributesForUser", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestGetAttributesForUser requestGetAttributesForUser;

    /**
     * Gets the value of the requestGetAttributesForUser property.
     * 
     * @return
     *     possible object is
     *     {@link RequestGetAttributesForUser }
     *     
     */
    public RequestGetAttributesForUser getRequestGetAttributesForUser() {
        return requestGetAttributesForUser;
    }

    /**
     * Sets the value of the requestGetAttributesForUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestGetAttributesForUser }
     *     
     */
    public void setRequestGetAttributesForUser(RequestGetAttributesForUser value) {
        this.requestGetAttributesForUser = value;
    }

}
