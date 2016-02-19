
package humana.websecurity.sl.webservice.messagetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseGetAttributesForEntityUserBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseGetAttributesForEntityUserBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMessageBase">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}EntityUserAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EntityGenKey" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseGetAttributesForEntityUserBase", propOrder = {
    "attributes"
})
@XmlSeeAlso({
    ResponseGetAttributesForEntityUser.class
})
public class ResponseGetAttributesForEntityUserBase
    extends ResponseMessageBase
{

    @XmlElement(name = "Attributes")
    protected List<EntityUserAttribute> attributes;
    @XmlAttribute(name = "EntityGenKey", required = true)
    protected int entityGenKey;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityUserAttribute }
     * 
     * 
     */
    public List<EntityUserAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<EntityUserAttribute>();
        }
        return this.attributes;
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

}
