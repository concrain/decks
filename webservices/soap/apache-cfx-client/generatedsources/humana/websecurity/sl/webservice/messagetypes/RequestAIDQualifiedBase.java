
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestAIDQualifiedBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestAIDQualifiedBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestForUserBase">
 *       &lt;sequence>
 *         &lt;element name="EntityGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Function" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MenuTemplate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestAIDQualifiedBase", propOrder = {
    "entityGenKey",
    "function",
    "menuTemplate"
})
@XmlSeeAlso({
    RequestAIDQualified.class
})
public class RequestAIDQualifiedBase
    extends RequestForUserBase
{

    @XmlElement(name = "EntityGenKey")
    protected int entityGenKey;
    @XmlElement(name = "Function")
    protected int function;
    @XmlElement(name = "MenuTemplate")
    protected int menuTemplate;

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
     * Gets the value of the function property.
     * 
     */
    public int getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     */
    public void setFunction(int value) {
        this.function = value;
    }

    /**
     * Gets the value of the menuTemplate property.
     * 
     */
    public int getMenuTemplate() {
        return menuTemplate;
    }

    /**
     * Sets the value of the menuTemplate property.
     * 
     */
    public void setMenuTemplate(int value) {
        this.menuTemplate = value;
    }

}
