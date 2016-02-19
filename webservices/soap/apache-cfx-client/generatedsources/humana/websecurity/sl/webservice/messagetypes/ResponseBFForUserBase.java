
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBFForUserBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBFForUserBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMessageBase">
 *       &lt;sequence>
 *         &lt;element name="Functions" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ArrayOfFunction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBFForUserBase", propOrder = {
    "functions"
})
@XmlSeeAlso({
    ResponseBFForUser.class
})
public class ResponseBFForUserBase
    extends ResponseMessageBase
{

    @XmlElement(name = "Functions")
    protected ArrayOfFunction functions;

    /**
     * Gets the value of the functions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFunction }
     *     
     */
    public ArrayOfFunction getFunctions() {
        return functions;
    }

    /**
     * Sets the value of the functions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFunction }
     *     
     */
    public void setFunctions(ArrayOfFunction value) {
        this.functions = value;
    }

}
