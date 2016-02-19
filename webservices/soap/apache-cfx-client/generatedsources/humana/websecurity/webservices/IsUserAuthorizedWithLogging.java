
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestKeyType;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestKeyType" minOccurs="0"/>
 *         &lt;element name="applicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eampId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "requestKeyType",
    "applicationName",
    "eampId"
})
@XmlRootElement(name = "IsUserAuthorizedWithLogging")
public class IsUserAuthorizedWithLogging {

    @XmlElement(name = "RequestKeyType", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestKeyType requestKeyType;
    protected String applicationName;
    protected int eampId;

    /**
     * Gets the value of the requestKeyType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestKeyType }
     *     
     */
    public RequestKeyType getRequestKeyType() {
        return requestKeyType;
    }

    /**
     * Sets the value of the requestKeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestKeyType }
     *     
     */
    public void setRequestKeyType(RequestKeyType value) {
        this.requestKeyType = value;
    }

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the eampId property.
     * 
     */
    public int getEampId() {
        return eampId;
    }

    /**
     * Sets the value of the eampId property.
     * 
     */
    public void setEampId(int value) {
        this.eampId = value;
    }

}
