
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}CodeDescriptionType" minOccurs="0"/>
 *         &lt;element name="RealVirtual" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RealVirtualType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "entityGenKey",
    "entityName",
    "entityType",
    "realVirtual"
})
public class Organization {

    @XmlElement(name = "EntityGenKey")
    protected int entityGenKey;
    @XmlElement(name = "EntityName")
    protected String entityName;
    @XmlElement(name = "EntityType")
    protected CodeDescriptionType entityType;
    @XmlElement(name = "RealVirtual", required = true)
    protected RealVirtualType realVirtual;

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
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setEntityType(CodeDescriptionType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the realVirtual property.
     * 
     * @return
     *     possible object is
     *     {@link RealVirtualType }
     *     
     */
    public RealVirtualType getRealVirtual() {
        return realVirtual;
    }

    /**
     * Sets the value of the realVirtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealVirtualType }
     *     
     */
    public void setRealVirtual(RealVirtualType value) {
        this.realVirtual = value;
    }

}
