
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseGetActiveUsersForEntity;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseGetActiveUsersForEntity" minOccurs="0"/>
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
    "responseGetActiveUsersForEntity"
})
@XmlRootElement(name = "GetActiveUsersForEntityResponse")
public class GetActiveUsersForEntityResponse {

    @XmlElement(name = "ResponseGetActiveUsersForEntity", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseGetActiveUsersForEntity responseGetActiveUsersForEntity;

    /**
     * Gets the value of the responseGetActiveUsersForEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseGetActiveUsersForEntity }
     *     
     */
    public ResponseGetActiveUsersForEntity getResponseGetActiveUsersForEntity() {
        return responseGetActiveUsersForEntity;
    }

    /**
     * Sets the value of the responseGetActiveUsersForEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseGetActiveUsersForEntity }
     *     
     */
    public void setResponseGetActiveUsersForEntity(ResponseGetActiveUsersForEntity value) {
        this.responseGetActiveUsersForEntity = value;
    }

}
