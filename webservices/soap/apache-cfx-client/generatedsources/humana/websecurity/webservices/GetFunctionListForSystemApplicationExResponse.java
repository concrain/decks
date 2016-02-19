
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.ResponseGetBFListForSystemApplication;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseGetBFListForSystemApplication" minOccurs="0"/>
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
    "responseGetBFListForSystemApplication"
})
@XmlRootElement(name = "GetFunctionListForSystemApplicationExResponse")
public class GetFunctionListForSystemApplicationExResponse {

    @XmlElement(name = "ResponseGetBFListForSystemApplication", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected ResponseGetBFListForSystemApplication responseGetBFListForSystemApplication;

    /**
     * Gets the value of the responseGetBFListForSystemApplication property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseGetBFListForSystemApplication }
     *     
     */
    public ResponseGetBFListForSystemApplication getResponseGetBFListForSystemApplication() {
        return responseGetBFListForSystemApplication;
    }

    /**
     * Sets the value of the responseGetBFListForSystemApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseGetBFListForSystemApplication }
     *     
     */
    public void setResponseGetBFListForSystemApplication(ResponseGetBFListForSystemApplication value) {
        this.responseGetBFListForSystemApplication = value;
    }

}
