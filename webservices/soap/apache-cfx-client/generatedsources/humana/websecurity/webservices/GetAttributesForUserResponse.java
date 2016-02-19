
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseGetAttributesForUser;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseGetAttributesForUser" minOccurs="0"/>
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
    "responseGetAttributesForUser"
})
@XmlRootElement(name = "GetAttributesForUserResponse")
public class GetAttributesForUserResponse {

    @XmlElement(name = "ResponseGetAttributesForUser", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseGetAttributesForUser responseGetAttributesForUser;

    /**
     * Gets the value of the responseGetAttributesForUser property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseGetAttributesForUser }
     *     
     */
    public ResponseGetAttributesForUser getResponseGetAttributesForUser() {
        return responseGetAttributesForUser;
    }

    /**
     * Sets the value of the responseGetAttributesForUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseGetAttributesForUser }
     *     
     */
    public void setResponseGetAttributesForUser(ResponseGetAttributesForUser value) {
        this.responseGetAttributesForUser = value;
    }

}
