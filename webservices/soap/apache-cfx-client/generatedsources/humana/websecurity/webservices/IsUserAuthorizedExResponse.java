
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseBool;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseBoolRoot" minOccurs="0"/>
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
    "responseBoolRoot"
})
@XmlRootElement(name = "IsUserAuthorizedExResponse")
public class IsUserAuthorizedExResponse {

    @XmlElement(name = "ResponseBoolRoot", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseBool responseBoolRoot;

    /**
     * Gets the value of the responseBoolRoot property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBool }
     *     
     */
    public ResponseBool getResponseBoolRoot() {
        return responseBoolRoot;
    }

    /**
     * Sets the value of the responseBoolRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBool }
     *     
     */
    public void setResponseBoolRoot(ResponseBool value) {
        this.responseBoolRoot = value;
    }

}
