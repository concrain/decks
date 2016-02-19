
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseGetDemographicsForEntity;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseGetDemographicsForEntity" minOccurs="0"/>
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
    "responseGetDemographicsForEntity"
})
@XmlRootElement(name = "GetDemographicsForEntityExResponse")
public class GetDemographicsForEntityExResponse {

    @XmlElement(name = "ResponseGetDemographicsForEntity", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseGetDemographicsForEntity responseGetDemographicsForEntity;

    /**
     * Gets the value of the responseGetDemographicsForEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseGetDemographicsForEntity }
     *     
     */
    public ResponseGetDemographicsForEntity getResponseGetDemographicsForEntity() {
        return responseGetDemographicsForEntity;
    }

    /**
     * Sets the value of the responseGetDemographicsForEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseGetDemographicsForEntity }
     *     
     */
    public void setResponseGetDemographicsForEntity(ResponseGetDemographicsForEntity value) {
        this.responseGetDemographicsForEntity = value;
    }

}
