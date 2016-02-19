
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestForUser;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestForUser" minOccurs="0"/>
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
    "requestForUser"
})
@XmlRootElement(name = "GetACLAccessIdsForUser")
public class GetACLAccessIdsForUser {

    @XmlElement(name = "RequestForUser", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestForUser requestForUser;

    /**
     * Gets the value of the requestForUser property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForUser }
     *     
     */
    public RequestForUser getRequestForUser() {
        return requestForUser;
    }

    /**
     * Sets the value of the requestForUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForUser }
     *     
     */
    public void setRequestForUser(RequestForUser value) {
        this.requestForUser = value;
    }

}
