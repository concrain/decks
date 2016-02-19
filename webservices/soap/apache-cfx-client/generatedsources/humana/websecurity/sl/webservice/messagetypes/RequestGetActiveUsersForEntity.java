
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestGetActiveUsersForEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestGetActiveUsersForEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entityUserTypeCode" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}EntityUserTypeCode"/>
 *         &lt;element name="akaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestGetActiveUsersForEntity", propOrder = {
    "entityGenKey",
    "entityUserTypeCode",
    "akaName"
})
public class RequestGetActiveUsersForEntity {

    protected int entityGenKey;
    @XmlElement(required = true)
    protected EntityUserTypeCode entityUserTypeCode;
    protected String akaName;

    /**
     * Gets the value of the entityGenKey property.
     * 
     */
    public int getEntityGenKey() {
        return entityGenKey;
    }

    /**
     * Sets the value of the entityGenKey property.
     * 
     */
    public void setEntityGenKey(int value) {
        this.entityGenKey = value;
    }

    /**
     * Gets the value of the entityUserTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityUserTypeCode }
     *     
     */
    public EntityUserTypeCode getEntityUserTypeCode() {
        return entityUserTypeCode;
    }

    /**
     * Sets the value of the entityUserTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityUserTypeCode }
     *     
     */
    public void setEntityUserTypeCode(EntityUserTypeCode value) {
        this.entityUserTypeCode = value;
    }

    /**
     * Gets the value of the akaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkaName() {
        return akaName;
    }

    /**
     * Sets the value of the akaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkaName(String value) {
        this.akaName = value;
    }

}
