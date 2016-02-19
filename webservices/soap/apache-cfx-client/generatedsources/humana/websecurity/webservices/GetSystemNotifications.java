
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="userTypeCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="originGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entityTypeCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "", propOrder = {
    "userTypeCd",
    "originGenKey",
    "entityTypeCd",
    "akaName"
})
@XmlRootElement(name = "GetSystemNotifications")
public class GetSystemNotifications {

    protected int userTypeCd;
    protected int originGenKey;
    protected int entityTypeCd;
    protected String akaName;

    /**
     * Gets the value of the userTypeCd property.
     * 
     */
    public int getUserTypeCd() {
        return userTypeCd;
    }

    /**
     * Sets the value of the userTypeCd property.
     * 
     */
    public void setUserTypeCd(int value) {
        this.userTypeCd = value;
    }

    /**
     * Gets the value of the originGenKey property.
     * 
     */
    public int getOriginGenKey() {
        return originGenKey;
    }

    /**
     * Sets the value of the originGenKey property.
     * 
     */
    public void setOriginGenKey(int value) {
        this.originGenKey = value;
    }

    /**
     * Gets the value of the entityTypeCd property.
     * 
     */
    public int getEntityTypeCd() {
        return entityTypeCd;
    }

    /**
     * Sets the value of the entityTypeCd property.
     * 
     */
    public void setEntityTypeCd(int value) {
        this.entityTypeCd = value;
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
