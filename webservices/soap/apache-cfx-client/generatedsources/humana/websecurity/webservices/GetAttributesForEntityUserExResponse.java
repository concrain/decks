
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseGetAttributesForEntityUser;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseGetAttributesForEntityUser" minOccurs="0"/>
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
    "responseGetAttributesForEntityUser"
})
@XmlRootElement(name = "GetAttributesForEntityUserExResponse")
public class GetAttributesForEntityUserExResponse {

    @XmlElement(name = "ResponseGetAttributesForEntityUser", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseGetAttributesForEntityUser responseGetAttributesForEntityUser;

    /**
     * Gets the value of the responseGetAttributesForEntityUser property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseGetAttributesForEntityUser }
     *     
     */
    public ResponseGetAttributesForEntityUser getResponseGetAttributesForEntityUser() {
        return responseGetAttributesForEntityUser;
    }

    /**
     * Sets the value of the responseGetAttributesForEntityUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseGetAttributesForEntityUser }
     *     
     */
    public void setResponseGetAttributesForEntityUser(ResponseGetAttributesForEntityUser value) {
        this.responseGetAttributesForEntityUser = value;
    }

}
