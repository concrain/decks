
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseGetUserAgreementsBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseGetUserAgreementsBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMessageBase">
 *       &lt;sequence>
 *         &lt;element name="Agreements" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ArrayOfAgreementDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseGetUserAgreementsBase", propOrder = {
    "agreements"
})
@XmlSeeAlso({
    ResponseGetUserAgreements.class
})
public class ResponseGetUserAgreementsBase
    extends ResponseMessageBase
{

    @XmlElement(name = "Agreements")
    protected ArrayOfAgreementDTO agreements;

    /**
     * Gets the value of the agreements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgreementDTO }
     *     
     */
    public ArrayOfAgreementDTO getAgreements() {
        return agreements;
    }

    /**
     * Sets the value of the agreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgreementDTO }
     *     
     */
    public void setAgreements(ArrayOfAgreementDTO value) {
        this.agreements = value;
    }

}
