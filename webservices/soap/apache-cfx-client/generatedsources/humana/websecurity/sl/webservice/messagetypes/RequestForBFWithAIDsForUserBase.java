
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestForBFWithAIDsForUserBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestForBFWithAIDsForUserBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestForUserBase">
 *       &lt;sequence>
 *         &lt;element name="EntityGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OriginGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SystemApplicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Function" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForBFWithAIDsForUserBase", propOrder = {
    "entityGenKey",
    "originGenKey",
    "systemApplicationId",
    "function"
})
@XmlSeeAlso({
    RequestForBFWithAIDsForUser.class
})
public class RequestForBFWithAIDsForUserBase
    extends RequestForUserBase
{

    @XmlElement(name = "EntityGenKey")
    protected int entityGenKey;
    @XmlElement(name = "OriginGenKey")
    protected int originGenKey;
    @XmlElement(name = "SystemApplicationId")
    protected int systemApplicationId;
    @XmlElement(name = "Function")
    protected int function;

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
     * Gets the value of the originGenKey property.
     * 
     */
    public int getOriginGenKey() {
        return originGenKey;
    }

    /**
     * Sets the value of the originGenKey property.
     * 
     */
    public void setOriginGenKey(int value) {
        this.originGenKey = value;
    }

    /**
     * Gets the value of the systemApplicationId property.
     * 
     */
    public int getSystemApplicationId() {
        return systemApplicationId;
    }

    /**
     * Sets the value of the systemApplicationId property.
     * 
     */
    public void setSystemApplicationId(int value) {
        this.systemApplicationId = value;
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

}
