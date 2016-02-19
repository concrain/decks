
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestFunctionsForUser;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestFunctionsForUser" minOccurs="0"/>
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
    "requestFunctionsForUser"
})
@XmlRootElement(name = "GetACLFunctionsForUser")
public class GetACLFunctionsForUser {

    @XmlElement(name = "RequestFunctionsForUser", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestFunctionsForUser requestFunctionsForUser;

    /**
     * Gets the value of the requestFunctionsForUser property.
     * 
     * @return
     *     possible object is
     *     {@link RequestFunctionsForUser }
     *     
     */
    public RequestFunctionsForUser getRequestFunctionsForUser() {
        return requestFunctionsForUser;
    }

    /**
     * Sets the value of the requestFunctionsForUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestFunctionsForUser }
     *     
     */
    public void setRequestFunctionsForUser(RequestFunctionsForUser value) {
        this.requestFunctionsForUser = value;
    }

}
