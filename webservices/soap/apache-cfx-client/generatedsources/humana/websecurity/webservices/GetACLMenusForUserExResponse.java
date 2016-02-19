
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseMenusForUser;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMenusForUser" minOccurs="0"/>
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
    "responseMenusForUser"
})
@XmlRootElement(name = "GetACLMenusForUserExResponse")
public class GetACLMenusForUserExResponse {

    @XmlElement(name = "ResponseMenusForUser", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseMenusForUser responseMenusForUser;

    /**
     * Gets the value of the responseMenusForUser property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMenusForUser }
     *     
     */
    public ResponseMenusForUser getResponseMenusForUser() {
        return responseMenusForUser;
    }

    /**
     * Sets the value of the responseMenusForUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMenusForUser }
     *     
     */
    public void setResponseMenusForUser(ResponseMenusForUser value) {
        this.responseMenusForUser = value;
    }

}
