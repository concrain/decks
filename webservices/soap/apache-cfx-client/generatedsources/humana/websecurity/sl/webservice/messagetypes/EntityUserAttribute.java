
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityUserAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityUserAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityUserGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntityUserAttributeGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttributeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttributeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityUserAttribute", propOrder = {
    "entityUserGenKey",
    "entityUserAttributeGenKey",
    "attributeNumber",
    "attributeIdentifier",
    "attributeValue"
})
public class EntityUserAttribute {

    @XmlElement(name = "EntityUserGenKey")
    protected int entityUserGenKey;
    @XmlElement(name = "EntityUserAttributeGenKey")
    protected int entityUserAttributeGenKey;
    @XmlElement(name = "AttributeNumber")
    protected int attributeNumber;
    @XmlElement(name = "AttributeIdentifier")
    protected String attributeIdentifier;
    @XmlElement(name = "AttributeValue")
    protected String attributeValue;

    /**
     * Gets the value of the entityUserGenKey property.
     * 
     */
    public int getEntityUserGenKey() {
        return entityUserGenKey;
    }

    /**
     * Sets the value of the entityUserGenKey property.
     * 
     */
    public void setEntityUserGenKey(int value) {
        this.entityUserGenKey = value;
    }

    /**
     * Gets the value of the entityUserAttributeGenKey property.
     * 
     */
    public int getEntityUserAttributeGenKey() {
        return entityUserAttributeGenKey;
    }

    /**
     * Sets the value of the entityUserAttributeGenKey property.
     * 
     */
    public void setEntityUserAttributeGenKey(int value) {
        this.entityUserAttributeGenKey = value;
    }

    /**
     * Gets the value of the attributeNumber property.
     * 
     */
    public int getAttributeNumber() {
        return attributeNumber;
    }

    /**
     * Sets the value of the attributeNumber property.
     * 
     */
    public void setAttributeNumber(int value) {
        this.attributeNumber = value;
    }

    /**
     * Gets the value of the attributeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeIdentifier() {
        return attributeIdentifier;
    }

    /**
     * Sets the value of the attributeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeIdentifier(String value) {
        this.attributeIdentifier = value;
    }

    /**
     * Gets the value of the attributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * Sets the value of the attributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeValue(String value) {
        this.attributeValue = value;
    }

}
