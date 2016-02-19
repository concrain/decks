
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestAIDForEntity;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestAIDForEntity" minOccurs="0"/>
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
    "requestAIDForEntity"
})
@XmlRootElement(name = "GetACLAccessIdsForEntity")
public class GetACLAccessIdsForEntity {

    @XmlElement(name = "RequestAIDForEntity", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestAIDForEntity requestAIDForEntity;

    /**
     * Gets the value of the requestAIDForEntity property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAIDForEntity }
     *     
     */
    public RequestAIDForEntity getRequestAIDForEntity() {
        return requestAIDForEntity;
    }

    /**
     * Sets the value of the requestAIDForEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAIDForEntity }
     *     
     */
    public void setRequestAIDForEntity(RequestAIDForEntity value) {
        this.requestAIDForEntity = value;
    }

}
