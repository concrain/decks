
package humana.websecurity.sl.webservice.messagetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseGetDemographicsForEntityBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseGetDemographicsForEntityBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMessageBase">
 *       &lt;sequence>
 *         &lt;element name="EntityGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentEntityGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MarketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}EntityType" minOccurs="0"/>
 *         &lt;element name="AccessApplicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DbaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityAddresses" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}EntityAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseGetDemographicsForEntityBase", propOrder = {
    "entityGenKey",
    "entityName",
    "telephoneNumber",
    "faxNumber",
    "parentEntityGenKey",
    "marketId",
    "entityType",
    "accessApplicationId",
    "dbaName",
    "entityAddresses"
})
@XmlSeeAlso({
    ResponseGetDemographicsForEntity.class
})
public class ResponseGetDemographicsForEntityBase
    extends ResponseMessageBase
{

    @XmlElement(name = "EntityGenKey")
    protected int entityGenKey;
    @XmlElement(name = "EntityName")
    protected String entityName;
    @XmlElement(name = "TelephoneNumber")
    protected String telephoneNumber;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "ParentEntityGenKey")
    protected int parentEntityGenKey;
    @XmlElement(name = "MarketId")
    protected String marketId;
    @XmlElement(name = "EntityType")
    protected EntityType entityType;
    @XmlElement(name = "AccessApplicationId")
    protected int accessApplicationId;
    @XmlElement(name = "DbaName")
    protected String dbaName;
    @XmlElement(name = "EntityAddresses")
    protected List<EntityAddress> entityAddresses;

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
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the parentEntityGenKey property.
     * 
     */
    public int getParentEntityGenKey() {
        return parentEntityGenKey;
    }

    /**
     * Sets the value of the parentEntityGenKey property.
     * 
     */
    public void setParentEntityGenKey(int value) {
        this.parentEntityGenKey = value;
    }

    /**
     * Gets the value of the marketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketId() {
        return marketId;
    }

    /**
     * Sets the value of the marketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketId(String value) {
        this.marketId = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntityType(EntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the accessApplicationId property.
     * 
     */
    public int getAccessApplicationId() {
        return accessApplicationId;
    }

    /**
     * Sets the value of the accessApplicationId property.
     * 
     */
    public void setAccessApplicationId(int value) {
        this.accessApplicationId = value;
    }

    /**
     * Gets the value of the dbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbaName() {
        return dbaName;
    }

    /**
     * Sets the value of the dbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbaName(String value) {
        this.dbaName = value;
    }

    /**
     * Gets the value of the entityAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityAddress }
     * 
     * 
     */
    public List<EntityAddress> getEntityAddresses() {
        if (entityAddresses == null) {
            entityAddresses = new ArrayList<EntityAddress>();
        }
        return this.entityAddresses;
    }

}
