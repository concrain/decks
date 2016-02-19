
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestMenusForUser;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestMenusForUser" minOccurs="0"/>
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
    "requestMenusForUser"
})
@XmlRootElement(name = "GetACLMenusForUserAsXML")
public class GetACLMenusForUserAsXML {

    @XmlElement(name = "RequestMenusForUser", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestMenusForUser requestMenusForUser;

    /**
     * Gets the value of the requestMenusForUser property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMenusForUser }
     *     
     */
    public RequestMenusForUser getRequestMenusForUser() {
        return requestMenusForUser;
    }

    /**
     * Sets the value of the requestMenusForUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMenusForUser }
     *     
     */
    public void setRequestMenusForUser(RequestMenusForUser value) {
        this.requestMenusForUser = value;
    }

}
