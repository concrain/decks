
package humana.websecurity.sl.webservice.messagetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseEntityAIDBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseEntityAIDBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMessageBase">
 *       &lt;sequence>
 *         &lt;element name="EntityGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseEntityAIDBase", propOrder = {
    "entityGenKey",
    "accessIds"
})
@XmlSeeAlso({
    ResponseEntityAID.class
})
public class ResponseEntityAIDBase
    extends ResponseMessageBase
{

    @XmlElement(name = "EntityGenKey")
    protected int entityGenKey;
    @XmlElement(name = "AccessIds")
    protected ResponseEntityAIDBase.AccessIds accessIds;

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
     * Gets the value of the accessIds property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEntityAIDBase.AccessIds }
     *     
     */
    public ResponseEntityAIDBase.AccessIds getAccessIds() {
        return accessIds;
    }

    /**
     * Sets the value of the accessIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEntityAIDBase.AccessIds }
     *     
     */
    public void setAccessIds(ResponseEntityAIDBase.AccessIds value) {
        this.accessIds = value;
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
