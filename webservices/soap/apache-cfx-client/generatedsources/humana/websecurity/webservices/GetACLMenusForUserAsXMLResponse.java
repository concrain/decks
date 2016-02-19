
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseMenuXML;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMenuXML" minOccurs="0"/>
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
    "responseMenuXML"
})
@XmlRootElement(name = "GetACLMenusForUserAsXMLResponse")
public class GetACLMenusForUserAsXMLResponse {

    @XmlElement(name = "ResponseMenuXML", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseMenuXML responseMenuXML;

    /**
     * Gets the value of the responseMenuXML property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMenuXML }
     *     
     */
    public ResponseMenuXML getResponseMenuXML() {
        return responseMenuXML;
    }

    /**
     * Sets the value of the responseMenuXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMenuXML }
     *     
     */
    public void setResponseMenuXML(ResponseMenuXML value) {
        this.responseMenuXML = value;
    }

}
