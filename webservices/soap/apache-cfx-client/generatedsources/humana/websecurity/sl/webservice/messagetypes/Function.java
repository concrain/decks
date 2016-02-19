
package humana.websecurity.sl.webservice.messagetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Function complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Function">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccessIdentifier" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}AccessIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OriginGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SystemApplicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultNavigationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InitialURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelegationTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Function", propOrder = {
    "accessIds",
    "genKey",
    "originGenKey",
    "systemApplicationId",
    "name",
    "description",
    "defaultNavigationName",
    "initialURL",
    "delegationTypeCd",
    "segment"
})
public class Function {

    @XmlElement(name = "AccessIds")
    protected Function.AccessIds accessIds;
    @XmlElement(name = "GenKey")
    protected int genKey;
    @XmlElement(name = "OriginGenKey")
    protected int originGenKey;
    @XmlElement(name = "SystemApplicationId")
    protected int systemApplicationId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DefaultNavigationName")
    protected String defaultNavigationName;
    @XmlElement(name = "InitialURL")
    protected String initialURL;
    @XmlElement(name = "DelegationTypeCd")
    protected String delegationTypeCd;
    @XmlElement(name = "Segment")
    protected boolean segment;

    /**
     * Gets the value of the accessIds property.
     * 
     * @return
     *     possible object is
     *     {@link Function.AccessIds }
     *     
     */
    public Function.AccessIds getAccessIds() {
        return accessIds;
    }

    /**
     * Sets the value of the accessIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function.AccessIds }
     *     
     */
    public void setAccessIds(Function.AccessIds value) {
        this.accessIds = value;
    }

    /**
     * Gets the value of the genKey property.
     * 
     */
    public int getGenKey() {
        return genKey;
    }

    /**
     * Sets the value of the genKey property.
     * 
     */
    public void setGenKey(int value) {
        this.genKey = value;
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
     * Gets the value of the systemApplicationId property.
     * 
     */
    public int getSystemApplicationId() {
        return systemApplicationId;
    }

    /**
     * Sets the value of the systemApplicationId property.
     * 
     */
    public void setSystemApplicationId(int value) {
        this.systemApplicationId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the defaultNavigationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultNavigationName() {
        return defaultNavigationName;
    }

    /**
     * Sets the value of the defaultNavigationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultNavigationName(String value) {
        this.defaultNavigationName = value;
    }

    /**
     * Gets the value of the initialURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialURL() {
        return initialURL;
    }

    /**
     * Sets the value of the initialURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialURL(String value) {
        this.initialURL = value;
    }

    /**
     * Gets the value of the delegationTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationTypeCd() {
        return delegationTypeCd;
    }

    /**
     * Sets the value of the delegationTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationTypeCd(String value) {
        this.delegationTypeCd = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     */
    public boolean isSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     */
    public void setSegment(boolean value) {
        this.segment = value;
    }


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
     *         &lt;element name="AccessIdentifier" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}AccessIdentifier" maxOccurs="unbounded" minOccurs="0"/>
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
        "accessIdentifier"
    })
    public static class AccessIds {

        @XmlElement(name = "AccessIdentifier")
        protected List<AccessIdentifier> accessIdentifier;

        /**
         * Gets the value of the accessIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accessIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccessIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccessIdentifier }
         * 
         * 
         */
        public List<AccessIdentifier> getAccessIdentifier() {
            if (accessIdentifier == null) {
                accessIdentifier = new ArrayList<AccessIdentifier>();
            }
            return this.accessIdentifier;
        }

    }

}
