
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMenusForUserBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseMenusForUserBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMessageBase">
 *       &lt;sequence>
 *         &lt;element name="MenuTemplates" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ArrayOfMenuTemplate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMenusForUserBase", propOrder = {
    "menuTemplates"
})
@XmlSeeAlso({
    ResponseMenusForUser.class
})
public class ResponseMenusForUserBase
    extends ResponseMessageBase
{

    @XmlElement(name = "MenuTemplates")
    protected ArrayOfMenuTemplate menuTemplates;

    /**
     * Gets the value of the menuTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMenuTemplate }
     *     
     */
    public ArrayOfMenuTemplate getMenuTemplates() {
        return menuTemplates;
    }

    /**
     * Sets the value of the menuTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMenuTemplate }
     *     
     */
    public void setMenuTemplates(ArrayOfMenuTemplate value) {
        this.menuTemplates = value;
    }

}
