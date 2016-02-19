
package humana.websecurity.sl.webservice.messagetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseGetBFListForSystemApplicationBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseGetBFListForSystemApplicationBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMessageBase">
 *       &lt;sequence>
 *         &lt;element name="SystemApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Functions" type="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}Function" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SystemApplicationId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseGetBFListForSystemApplicationBase", propOrder = {
    "systemApplicationName",
    "functions"
})
@XmlSeeAlso({
    ResponseGetBFListForSystemApplication.class
})
public class ResponseGetBFListForSystemApplicationBase
    extends ResponseMessageBase
{

    @XmlElement(name = "SystemApplicationName")
    protected String systemApplicationName;
    @XmlElement(name = "Functions")
    protected List<Function> functions;
    @XmlAttribute(name = "SystemApplicationId")
    protected Integer systemApplicationId;

    /**
     * Gets the value of the systemApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemApplicationName() {
        return systemApplicationName;
    }

    /**
     * Sets the value of the systemApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemApplicationName(String value) {
        this.systemApplicationName = value;
    }

    /**
     * Gets the value of the functions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Function }
     * 
     * 
     */
    public List<Function> getFunctions() {
        if (functions == null) {
            functions = new ArrayList<Function>();
        }
        return this.functions;
    }

    /**
     * Gets the value of the systemApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSystemApplicationId() {
        return systemApplicationId;
    }

    /**
     * Sets the value of the systemApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSystemApplicationId(Integer value) {
        this.systemApplicationId = value;
    }

}
