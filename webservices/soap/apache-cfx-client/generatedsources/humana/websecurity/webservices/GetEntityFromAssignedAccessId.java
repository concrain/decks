
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestEntityListFromAccessId;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestEntityListFromAccessId" minOccurs="0"/>
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
    "requestEntityListFromAccessId"
})
@XmlRootElement(name = "GetEntityFromAssignedAccessId")
public class GetEntityFromAssignedAccessId {

    @XmlElement(name = "RequestEntityListFromAccessId", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestEntityListFromAccessId requestEntityListFromAccessId;

    /**
     * Gets the value of the requestEntityListFromAccessId property.
     * 
     * @return
     *     possible object is
     *     {@link RequestEntityListFromAccessId }
     *     
     */
    public RequestEntityListFromAccessId getRequestEntityListFromAccessId() {
        return requestEntityListFromAccessId;
    }

    /**
     * Sets the value of the requestEntityListFromAccessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestEntityListFromAccessId }
     *     
     */
    public void setRequestEntityListFromAccessId(RequestEntityListFromAccessId value) {
        this.requestEntityListFromAccessId = value;
    }

}
