
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseEntityAID;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseEntityAID" minOccurs="0"/>
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
    "responseEntityAID"
})
@XmlRootElement(name = "GetACLAccessIdsForEntityResponse")
public class GetACLAccessIdsForEntityResponse {

    @XmlElement(name = "ResponseEntityAID", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseEntityAID responseEntityAID;

    /**
     * Gets the value of the responseEntityAID property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEntityAID }
     *     
     */
    public ResponseEntityAID getResponseEntityAID() {
        return responseEntityAID;
    }

    /**
     * Sets the value of the responseEntityAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEntityAID }
     *     
     */
    public void setResponseEntityAID(ResponseEntityAID value) {
        this.responseEntityAID = value;
    }

}
