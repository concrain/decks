
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestAIDForEntityBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestAIDForEntityBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyType" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}KeyTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestAIDForEntityBase", propOrder = {
    "entityGenKey",
    "key",
    "keyType"
})
@XmlSeeAlso({
    RequestAIDForEntity.class
})
public class RequestAIDForEntityBase {

    @XmlElement(name = "EntityGenKey")
    protected int entityGenKey;
    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "KeyType", required = true)
    protected KeyTypeType keyType;

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
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link KeyTypeType }
     *     
     */
    public KeyTypeType getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTypeType }
     *     
     */
    public void setKeyType(KeyTypeType value) {
        this.keyType = value;
    }

}
