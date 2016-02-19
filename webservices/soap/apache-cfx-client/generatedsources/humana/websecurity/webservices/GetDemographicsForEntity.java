
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestGetDemographicsForEntity;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestGetDemographicsForEntity" minOccurs="0"/>
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
    "requestGetDemographicsForEntity"
})
@XmlRootElement(name = "GetDemographicsForEntity")
public class GetDemographicsForEntity {

    @XmlElement(name = "RequestGetDemographicsForEntity", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestGetDemographicsForEntity requestGetDemographicsForEntity;

    /**
     * Gets the value of the requestGetDemographicsForEntity property.
     * 
     * @return
     *     possible object is
     *     {@link RequestGetDemographicsForEntity }
     *     
     */
    public RequestGetDemographicsForEntity getRequestGetDemographicsForEntity() {
        return requestGetDemographicsForEntity;
    }

    /**
     * Sets the value of the requestGetDemographicsForEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestGetDemographicsForEntity }
     *     
     */
    public void setRequestGetDemographicsForEntity(RequestGetDemographicsForEntity value) {
        this.requestGetDemographicsForEntity = value;
    }

}
