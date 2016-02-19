
package humana.websecurity.sl.webservice.messagetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseGetActiveUsersForEntityBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseGetActiveUsersForEntityBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMessageBase">
 *       &lt;sequence>
 *         &lt;element name="EntityGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activeUsers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ActiveUser" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ActiveUser" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ResponseGetActiveUsersForEntityBase", propOrder = {
    "entityGenKey",
    "activeUsers"
})
@XmlSeeAlso({
    ResponseGetActiveUsersForEntity.class
})
public class ResponseGetActiveUsersForEntityBase
    extends ResponseMessageBase
{

    @XmlElement(name = "EntityGenKey")
    protected int entityGenKey;
    protected ResponseGetActiveUsersForEntityBase.ActiveUsers activeUsers;

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
     * Gets the value of the activeUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseGetActiveUsersForEntityBase.ActiveUsers }
     *     
     */
    public ResponseGetActiveUsersForEntityBase.ActiveUsers getActiveUsers() {
        return activeUsers;
    }

    /**
     * Sets the value of the activeUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseGetActiveUsersForEntityBase.ActiveUsers }
     *     
     */
    public void setActiveUsers(ResponseGetActiveUsersForEntityBase.ActiveUsers value) {
        this.activeUsers = value;
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
     *         &lt;element name="ActiveUser" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ActiveUser" maxOccurs="unbounded" minOccurs="0"/>
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
        "activeUser"
    })
    public static class ActiveUsers {

        @XmlElement(name = "ActiveUser", nillable = true)
        protected List<ActiveUser> activeUser;

        /**
         * Gets the value of the activeUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activeUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActiveUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActiveUser }
         * 
         * 
         */
        public List<ActiveUser> getActiveUser() {
            if (activeUser == null) {
                activeUser = new ArrayList<ActiveUser>();
            }
            return this.activeUser;
        }

    }

}
