
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
 *         &lt;element name="originGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="akaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="menuLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="menuGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "originGenKey",
    "akaName",
    "menuLevel",
    "menuGenKey",
    "sessionId"
})
@XmlRootElement(name = "GetUserMenusXML")
public class GetUserMenusXML {

    protected int originGenKey;
    protected String akaName;
    protected int menuLevel;
    protected int menuGenKey;
    protected String sessionId;

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

    /**
     * Gets the value of the menuLevel property.
     * 
     */
    public int getMenuLevel() {
        return menuLevel;
    }

    /**
     * Sets the value of the menuLevel property.
     * 
     */
    public void setMenuLevel(int value) {
        this.menuLevel = value;
    }

    /**
     * Gets the value of the menuGenKey property.
     * 
     */
    public int getMenuGenKey() {
        return menuGenKey;
    }

    /**
     * Sets the value of the menuGenKey property.
     * 
     */
    public void setMenuGenKey(int value) {
        this.menuGenKey = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

}
