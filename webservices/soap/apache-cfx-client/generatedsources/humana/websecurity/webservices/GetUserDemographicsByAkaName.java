
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestGetUserDemographicsByAkaName;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestGetUserDemographicsByAkaName" minOccurs="0"/>
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
    "requestGetUserDemographicsByAkaName"
})
@XmlRootElement(name = "GetUserDemographicsByAkaName")
public class GetUserDemographicsByAkaName {

    @XmlElement(name = "RequestGetUserDemographicsByAkaName", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestGetUserDemographicsByAkaName requestGetUserDemographicsByAkaName;

    /**
     * Gets the value of the requestGetUserDemographicsByAkaName property.
     * 
     * @return
     *     possible object is
     *     {@link RequestGetUserDemographicsByAkaName }
     *     
     */
    public RequestGetUserDemographicsByAkaName getRequestGetUserDemographicsByAkaName() {
        return requestGetUserDemographicsByAkaName;
    }

    /**
     * Sets the value of the requestGetUserDemographicsByAkaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestGetUserDemographicsByAkaName }
     *     
     */
    public void setRequestGetUserDemographicsByAkaName(RequestGetUserDemographicsByAkaName value) {
        this.requestGetUserDemographicsByAkaName = value;
    }

}
