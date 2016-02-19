
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Session complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Session">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AkaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastActivityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LogOutDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrginGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrowserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrowserVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivateSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastLoginDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SessionSourceCdTableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionSourceCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoRecordFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Session", propOrder = {
    "sessionId",
    "akaName",
    "userId",
    "loginDateTime",
    "lastActivityDateTime",
    "logOutDateTime",
    "orginGenKey",
    "clientIPAddress",
    "browserType",
    "browserVersion",
    "privateSessionId",
    "lastLoginDateTime",
    "sessionSourceCdTableId",
    "sessionSourceCd",
    "noRecordFound"
})
public class Session {

    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "AkaName")
    protected String akaName;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "LoginDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loginDateTime;
    @XmlElement(name = "LastActivityDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActivityDateTime;
    @XmlElement(name = "LogOutDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar logOutDateTime;
    @XmlElement(name = "OrginGenKey")
    protected int orginGenKey;
    @XmlElement(name = "ClientIPAddress")
    protected String clientIPAddress;
    @XmlElement(name = "BrowserType")
    protected String browserType;
    @XmlElement(name = "BrowserVersion")
    protected String browserVersion;
    @XmlElement(name = "PrivateSessionId")
    protected String privateSessionId;
    @XmlElement(name = "LastLoginDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginDateTime;
    @XmlElement(name = "SessionSourceCdTableId")
    protected String sessionSourceCdTableId;
    @XmlElement(name = "SessionSourceCd")
    protected String sessionSourceCd;
    @XmlElement(name = "NoRecordFound")
    protected boolean noRecordFound;

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
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the loginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoginDateTime() {
        return loginDateTime;
    }

    /**
     * Sets the value of the loginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoginDateTime(XMLGregorianCalendar value) {
        this.loginDateTime = value;
    }

    /**
     * Gets the value of the lastActivityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActivityDateTime() {
        return lastActivityDateTime;
    }

    /**
     * Sets the value of the lastActivityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActivityDateTime(XMLGregorianCalendar value) {
        this.lastActivityDateTime = value;
    }

    /**
     * Gets the value of the logOutDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLogOutDateTime() {
        return logOutDateTime;
    }

    /**
     * Sets the value of the logOutDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLogOutDateTime(XMLGregorianCalendar value) {
        this.logOutDateTime = value;
    }

    /**
     * Gets the value of the orginGenKey property.
     * 
     */
    public int getOrginGenKey() {
        return orginGenKey;
    }

    /**
     * Sets the value of the orginGenKey property.
     * 
     */
    public void setOrginGenKey(int value) {
        this.orginGenKey = value;
    }

    /**
     * Gets the value of the clientIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIPAddress() {
        return clientIPAddress;
    }

    /**
     * Sets the value of the clientIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIPAddress(String value) {
        this.clientIPAddress = value;
    }

    /**
     * Gets the value of the browserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserType() {
        return browserType;
    }

    /**
     * Sets the value of the browserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserType(String value) {
        this.browserType = value;
    }

    /**
     * Gets the value of the browserVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserVersion() {
        return browserVersion;
    }

    /**
     * Sets the value of the browserVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserVersion(String value) {
        this.browserVersion = value;
    }

    /**
     * Gets the value of the privateSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateSessionId() {
        return privateSessionId;
    }

    /**
     * Sets the value of the privateSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateSessionId(String value) {
        this.privateSessionId = value;
    }

    /**
     * Gets the value of the lastLoginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    /**
     * Sets the value of the lastLoginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginDateTime(XMLGregorianCalendar value) {
        this.lastLoginDateTime = value;
    }

    /**
     * Gets the value of the sessionSourceCdTableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionSourceCdTableId() {
        return sessionSourceCdTableId;
    }

    /**
     * Sets the value of the sessionSourceCdTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionSourceCdTableId(String value) {
        this.sessionSourceCdTableId = value;
    }

    /**
     * Gets the value of the sessionSourceCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionSourceCd() {
        return sessionSourceCd;
    }

    /**
     * Sets the value of the sessionSourceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionSourceCd(String value) {
        this.sessionSourceCd = value;
    }

    /**
     * Gets the value of the noRecordFound property.
     * 
     */
    public boolean isNoRecordFound() {
        return noRecordFound;
    }

    /**
     * Sets the value of the noRecordFound property.
     * 
     */
    public void setNoRecordFound(boolean value) {
        this.noRecordFound = value;
    }

}
