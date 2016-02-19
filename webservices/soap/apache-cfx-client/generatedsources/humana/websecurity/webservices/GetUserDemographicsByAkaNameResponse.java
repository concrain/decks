
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseGetUserDemographics;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseGetUserDemographics" minOccurs="0"/>
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
    "responseGetUserDemographics"
})
@XmlRootElement(name = "GetUserDemographicsByAkaNameResponse")
public class GetUserDemographicsByAkaNameResponse {

    @XmlElement(name = "ResponseGetUserDemographics", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseGetUserDemographics responseGetUserDemographics;

    /**
     * Gets the value of the responseGetUserDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseGetUserDemographics }
     *     
     */
    public ResponseGetUserDemographics getResponseGetUserDemographics() {
        return responseGetUserDemographics;
    }

    /**
     * Sets the value of the responseGetUserDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseGetUserDemographics }
     *     
     */
    public void setResponseGetUserDemographics(ResponseGetUserDemographics value) {
        this.responseGetUserDemographics = value;
    }

}
