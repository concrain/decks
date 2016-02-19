
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestAIDQualified;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestAIDQualified" minOccurs="0"/>
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
    "requestAIDQualified"
})
@XmlRootElement(name = "GetACLAccessIdsQualifiedForUser")
public class GetACLAccessIdsQualifiedForUser {

    @XmlElement(name = "RequestAIDQualified", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestAIDQualified requestAIDQualified;

    /**
     * Gets the value of the requestAIDQualified property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAIDQualified }
     *     
     */
    public RequestAIDQualified getRequestAIDQualified() {
        return requestAIDQualified;
    }

    /**
     * Sets the value of the requestAIDQualified property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAIDQualified }
     *     
     */
    public void setRequestAIDQualified(RequestAIDQualified value) {
        this.requestAIDQualified = value;
    }

}
