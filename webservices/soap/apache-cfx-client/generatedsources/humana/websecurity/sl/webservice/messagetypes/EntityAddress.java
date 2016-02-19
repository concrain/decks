
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityAddress complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EntityAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}Address">
 *       &lt;sequence>
 *         &lt;element name="ChangeType" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}AvailableActions"/>
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityAddress", propOrder = {
    "changeType",
    "addressType",
    "addressDescription",
    "telephoneNumber",
    "extension",
    "faxNumber"
})
public class EntityAddress
    extends Address
{

    @XmlElement(name = "ChangeType", required = true)
    protected AvailableActions changeType;
    @XmlElement(name = "AddressType")
    protected String addressType;
    @XmlElement(name = "AddressDescription")
    protected String addressDescription;
    @XmlElement(name = "TelephoneNumber")
    protected String telephoneNumber;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;

    /**
     * Gets the value of the changeType property.
     *
     * @return
     *     possible object is
     *     {@link AvailableActions }
     *
     */
    public AvailableActions getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     *
     * @param value
     *     allowed object is
     *     {@link AvailableActions }
     *
     */
    public void setChangeType(AvailableActions value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the addressType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressDescription() {
        return addressDescription;
    }

    /**
     * Sets the value of the addressDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressDescription(String value) {
        this.addressDescription = value;
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
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExtension(String value) {
        this.extension = value;
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

}
