
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemApplicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="attributeNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "systemApplicationId",
    "attributeNbr"
})
@XmlRootElement(name = "GetSystemApplicationAttributeRow")
public class GetSystemApplicationAttributeRow {

    protected int systemApplicationId;
    protected int attributeNbr;

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
     * Gets the value of the attributeNbr property.
     * 
     */
    public int getAttributeNbr() {
        return attributeNbr;
    }

    /**
     * Sets the value of the attributeNbr property.
     * 
     */
    public void setAttributeNbr(int value) {
        this.attributeNbr = value;
    }

}
