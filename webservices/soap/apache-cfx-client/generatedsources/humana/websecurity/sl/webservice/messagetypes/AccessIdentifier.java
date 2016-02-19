
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntityGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccessId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessIdType" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}CodeDescriptionType" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SourceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByAkaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessIdentifier", propOrder = {
    "genKey",
    "entityGenKey",
    "accessId",
    "accessIdType",
    "comment",
    "shortDescription",
    "longDescription",
    "classCode",
    "parent",
    "sourceTypeCode",
    "source",
    "createdByAkaName"
})
public class AccessIdentifier {

    @XmlElement(name = "GenKey")
    protected int genKey;
    @XmlElement(name = "EntityGenKey")
    protected int entityGenKey;
    @XmlElement(name = "AccessId")
    protected String accessId;
    @XmlElement(name = "AccessIdType")
    protected CodeDescriptionType accessIdType;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ShortDescription")
    protected String shortDescription;
    @XmlElement(name = "LongDescription")
    protected String longDescription;
    @XmlElement(name = "ClassCode")
    protected String classCode;
    @XmlElement(name = "Parent")
    protected int parent;
    @XmlElement(name = "SourceTypeCode")
    protected String sourceTypeCode;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "CreatedByAkaName")
    protected String createdByAkaName;

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
     * Gets the value of the accessId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessId() {
        return accessId;
    }

    /**
     * Sets the value of the accessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessId(String value) {
        this.accessId = value;
    }

    /**
     * Gets the value of the accessIdType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getAccessIdType() {
        return accessIdType;
    }

    /**
     * Sets the value of the accessIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setAccessIdType(CodeDescriptionType value) {
        this.accessIdType = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     */
    public int getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     */
    public void setParent(int value) {
        this.parent = value;
    }

    /**
     * Gets the value of the sourceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTypeCode() {
        return sourceTypeCode;
    }

    /**
     * Sets the value of the sourceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTypeCode(String value) {
        this.sourceTypeCode = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the createdByAkaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByAkaName() {
        return createdByAkaName;
    }

    /**
     * Sets the value of the createdByAkaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByAkaName(String value) {
        this.createdByAkaName = value;
    }

}
