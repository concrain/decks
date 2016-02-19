
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseOrganizationList;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseOrganizationList" minOccurs="0"/>
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
    "responseOrganizationList"
})
@XmlRootElement(name = "GetOrganizationListForUserExResponse")
public class GetOrganizationListForUserExResponse {

    @XmlElement(name = "ResponseOrganizationList", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseOrganizationList responseOrganizationList;

    /**
     * Gets the value of the responseOrganizationList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseOrganizationList }
     *     
     */
    public ResponseOrganizationList getResponseOrganizationList() {
        return responseOrganizationList;
    }

    /**
     * Sets the value of the responseOrganizationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseOrganizationList }
     *     
     */
    public void setResponseOrganizationList(ResponseOrganizationList value) {
        this.responseOrganizationList = value;
    }

}
