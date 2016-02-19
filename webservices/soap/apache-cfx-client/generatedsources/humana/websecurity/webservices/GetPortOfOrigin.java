
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
 *         &lt;element name="originGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "originGenKey"
})
@XmlRootElement(name = "GetPortOfOrigin")
public class GetPortOfOrigin {

    protected int originGenKey;

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

}
