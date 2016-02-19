
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseGetUserAgreements;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseGetUserAgreements" minOccurs="0"/>
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
    "responseGetUserAgreements"
})
@XmlRootElement(name = "GetUserAgreementsResponse")
public class GetUserAgreementsResponse {

    @XmlElement(name = "ResponseGetUserAgreements", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseGetUserAgreements responseGetUserAgreements;

    /**
     * Gets the value of the responseGetUserAgreements property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseGetUserAgreements }
     *     
     */
    public ResponseGetUserAgreements getResponseGetUserAgreements() {
        return responseGetUserAgreements;
    }

    /**
     * Sets the value of the responseGetUserAgreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseGetUserAgreements }
     *     
     */
    public void setResponseGetUserAgreements(ResponseGetUserAgreements value) {
        this.responseGetUserAgreements = value;
    }

}
