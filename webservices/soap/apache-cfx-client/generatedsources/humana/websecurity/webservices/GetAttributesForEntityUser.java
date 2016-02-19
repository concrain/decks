
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestGetAttributesForEntityUser;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestGetAttributesForEntityUser" minOccurs="0"/>
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
    "requestGetAttributesForEntityUser"
})
@XmlRootElement(name = "GetAttributesForEntityUser")
public class GetAttributesForEntityUser {

    @XmlElement(name = "RequestGetAttributesForEntityUser", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestGetAttributesForEntityUser requestGetAttributesForEntityUser;

    /**
     * Gets the value of the requestGetAttributesForEntityUser property.
     * 
     * @return
     *     possible object is
     *     {@link RequestGetAttributesForEntityUser }
     *     
     */
    public RequestGetAttributesForEntityUser getRequestGetAttributesForEntityUser() {
        return requestGetAttributesForEntityUser;
    }

    /**
     * Sets the value of the requestGetAttributesForEntityUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestGetAttributesForEntityUser }
     *     
     */
    public void setRequestGetAttributesForEntityUser(RequestGetAttributesForEntityUser value) {
        this.requestGetAttributesForEntityUser = value;
    }

}
