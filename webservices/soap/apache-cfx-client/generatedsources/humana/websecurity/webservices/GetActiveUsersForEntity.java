
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestGetActiveUsersForEntity;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestGetActiveUsersForEntity" minOccurs="0"/>
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
    "requestGetActiveUsersForEntity"
})
@XmlRootElement(name = "GetActiveUsersForEntity")
public class GetActiveUsersForEntity {

    @XmlElement(name = "RequestGetActiveUsersForEntity", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestGetActiveUsersForEntity requestGetActiveUsersForEntity;

    /**
     * Gets the value of the requestGetActiveUsersForEntity property.
     * 
     * @return
     *     possible object is
     *     {@link RequestGetActiveUsersForEntity }
     *     
     */
    public RequestGetActiveUsersForEntity getRequestGetActiveUsersForEntity() {
        return requestGetActiveUsersForEntity;
    }

    /**
     * Sets the value of the requestGetActiveUsersForEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestGetActiveUsersForEntity }
     *     
     */
    public void setRequestGetActiveUsersForEntity(RequestGetActiveUsersForEntity value) {
        this.requestGetActiveUsersForEntity = value;
    }

}
