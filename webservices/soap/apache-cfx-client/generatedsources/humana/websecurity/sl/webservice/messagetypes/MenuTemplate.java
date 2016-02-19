
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MenuTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MenuTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MenuGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MenuTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MenuLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MenuSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MenuToolTip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BFGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParentGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChildGenKeys" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MenuTemplate", propOrder = {
    "menuGenKey",
    "tag1",
    "tag2",
    "menuTitle",
    "menuLevel",
    "menuSequence",
    "menuToolTip",
    "returnURL",
    "accessAllowed",
    "bfGenKey",
    "parentGenKey",
    "childGenKeys"
})
public class MenuTemplate {

    @XmlElement(name = "MenuGenKey")
    protected int menuGenKey;
    @XmlElement(name = "Tag1")
    protected String tag1;
    @XmlElement(name = "Tag2")
    protected String tag2;
    @XmlElement(name = "MenuTitle")
    protected String menuTitle;
    @XmlElement(name = "MenuLevel")
    protected int menuLevel;
    @XmlElement(name = "MenuSequence")
    protected int menuSequence;
    @XmlElement(name = "MenuToolTip")
    protected String menuToolTip;
    @XmlElement(name = "ReturnURL")
    protected String returnURL;
    @XmlElement(name = "AccessAllowed")
    protected String accessAllowed;
    @XmlElement(name = "BFGenKey")
    protected int bfGenKey;
    @XmlElement(name = "ParentGenKey")
    protected int parentGenKey;
    @XmlElement(name = "ChildGenKeys")
    protected ArrayOfInt childGenKeys;

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
     * Gets the value of the tag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag1() {
        return tag1;
    }

    /**
     * Sets the value of the tag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag1(String value) {
        this.tag1 = value;
    }

    /**
     * Gets the value of the tag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag2() {
        return tag2;
    }

    /**
     * Sets the value of the tag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag2(String value) {
        this.tag2 = value;
    }

    /**
     * Gets the value of the menuTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuTitle() {
        return menuTitle;
    }

    /**
     * Sets the value of the menuTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuTitle(String value) {
        this.menuTitle = value;
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
     * Gets the value of the menuSequence property.
     * 
     */
    public int getMenuSequence() {
        return menuSequence;
    }

    /**
     * Sets the value of the menuSequence property.
     * 
     */
    public void setMenuSequence(int value) {
        this.menuSequence = value;
    }

    /**
     * Gets the value of the menuToolTip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuToolTip() {
        return menuToolTip;
    }

    /**
     * Sets the value of the menuToolTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuToolTip(String value) {
        this.menuToolTip = value;
    }

    /**
     * Gets the value of the returnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Sets the value of the returnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Gets the value of the accessAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessAllowed() {
        return accessAllowed;
    }

    /**
     * Sets the value of the accessAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessAllowed(String value) {
        this.accessAllowed = value;
    }

    /**
     * Gets the value of the bfGenKey property.
     * 
     */
    public int getBFGenKey() {
        return bfGenKey;
    }

    /**
     * Sets the value of the bfGenKey property.
     * 
     */
    public void setBFGenKey(int value) {
        this.bfGenKey = value;
    }

    /**
     * Gets the value of the parentGenKey property.
     * 
     */
    public int getParentGenKey() {
        return parentGenKey;
    }

    /**
     * Sets the value of the parentGenKey property.
     * 
     */
    public void setParentGenKey(int value) {
        this.parentGenKey = value;
    }

    /**
     * Gets the value of the childGenKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getChildGenKeys() {
        return childGenKeys;
    }

    /**
     * Sets the value of the childGenKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setChildGenKeys(ArrayOfInt value) {
        this.childGenKeys = value;
    }

}
