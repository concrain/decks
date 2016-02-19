
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMenuXMLBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseMenuXMLBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMessageBase">
 *       &lt;sequence>
 *         &lt;element name="MenuXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMenuXMLBase", propOrder = {
    "menuXML"
})
@XmlSeeAlso({
    ResponseMenuXML.class
})
public class ResponseMenuXMLBase
    extends ResponseMessageBase
{

    @XmlElement(name = "MenuXML")
    protected String menuXML;

    /**
     * Gets the value of the menuXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuXML() {
        return menuXML;
    }

    /**
     * Sets the value of the menuXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuXML(String value) {
        this.menuXML = value;
    }

}
