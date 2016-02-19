
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActiveUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActiveUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityUserGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntityUserTypeCode" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}EntityUserTypeCode"/>
 *         &lt;element name="userInfo" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseGetUserDemographics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveUser", propOrder = {
    "entityUserGenKey",
    "entityUserTypeCode",
    "userInfo"
})
public class ActiveUser {

    @XmlElement(name = "EntityUserGenKey")
    protected int entityUserGenKey;
    @XmlElement(name = "EntityUserTypeCode", required = true)
    protected EntityUserTypeCode entityUserTypeCode;
    protected ResponseGetUserDemographics userInfo;

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
     * Gets the value of the entityUserTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityUserTypeCode }
     *     
     */
    public EntityUserTypeCode getEntityUserTypeCode() {
        return entityUserTypeCode;
    }

    /**
     * Sets the value of the entityUserTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityUserTypeCode }
     *     
     */
    public void setEntityUserTypeCode(EntityUserTypeCode value) {
        this.entityUserTypeCode = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseGetUserDemographics }
     *     
     */
    public ResponseGetUserDemographics getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseGetUserDemographics }
     *     
     */
    public void setUserInfo(ResponseGetUserDemographics value) {
        this.userInfo = value;
    }

}
