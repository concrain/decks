
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseBFForUser;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseBFForUser" minOccurs="0"/>
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
    "responseBFForUser"
})
@XmlRootElement(name = "GetACLFunctionsForUserResponse")
public class GetACLFunctionsForUserResponse {

    @XmlElement(name = "ResponseBFForUser", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseBFForUser responseBFForUser;

    /**
     * Gets the value of the responseBFForUser property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBFForUser }
     *     
     */
    public ResponseBFForUser getResponseBFForUser() {
        return responseBFForUser;
    }

    /**
     * Sets the value of the responseBFForUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBFForUser }
     *     
     */
    public void setResponseBFForUser(ResponseBFForUser value) {
        this.responseBFForUser = value;
    }

}
