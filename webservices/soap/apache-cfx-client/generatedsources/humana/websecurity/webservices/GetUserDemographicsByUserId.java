
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestGetUserDemographicsByUserID;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestGetUserDemographicsByUserID" minOccurs="0"/>
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
    "requestGetUserDemographicsByUserID"
})
@XmlRootElement(name = "GetUserDemographicsByUserId")
public class GetUserDemographicsByUserId {

    @XmlElement(name = "RequestGetUserDemographicsByUserID", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestGetUserDemographicsByUserID requestGetUserDemographicsByUserID;

    /**
     * Gets the value of the requestGetUserDemographicsByUserID property.
     * 
     * @return
     *     possible object is
     *     {@link RequestGetUserDemographicsByUserID }
     *     
     */
    public RequestGetUserDemographicsByUserID getRequestGetUserDemographicsByUserID() {
        return requestGetUserDemographicsByUserID;
    }

    /**
     * Sets the value of the requestGetUserDemographicsByUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestGetUserDemographicsByUserID }
     *     
     */
    public void setRequestGetUserDemographicsByUserID(RequestGetUserDemographicsByUserID value) {
        this.requestGetUserDemographicsByUserID = value;
    }

}
