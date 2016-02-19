
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResponseMessageBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseMessageBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoRecordFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Status" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseStatusType"/>
 *         &lt;element name="comments" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ArrayOfComment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AsOfDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMessageBase", propOrder = {
    "noRecordFound",
    "status",
    "comments"
})
@XmlSeeAlso({
    ResponseGetUserDemographicsBase.class,
    ResponseMenuXMLBase.class,
    ResponseGetUserAgreementsBase.class,
    ResponseMenusForUserBase.class,
    ResponseUserDTOBase.class,
    ResponseGetDemographicsForEntityBase.class,
    ResponseBoolBase.class,
    ResponseEntityAIDBase.class,
    ResponseBFForUserBase.class,
    ResponseGetActiveUsersForEntityBase.class,
    ResponseGetAttributesForEntityUserBase.class,
    ResponseGetAttributesForUserBase.class,
    ResponseOrganizationListBase.class,
    ResponseGetBFListForSystemApplicationBase.class
})
public class ResponseMessageBase {

    @XmlElement(name = "NoRecordFound")
    protected boolean noRecordFound;
    @XmlElement(name = "Status", required = true)
    protected ResponseStatusType status;
    protected ArrayOfComment comments;
    @XmlAttribute(name = "AsOfDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfDate;

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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusType }
     *     
     */
    public ResponseStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusType }
     *     
     */
    public void setStatus(ResponseStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComment }
     *     
     */
    public ArrayOfComment getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComment }
     *     
     */
    public void setComments(ArrayOfComment value) {
        this.comments = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDate(XMLGregorianCalendar value) {
        this.asOfDate = value;
    }

}
