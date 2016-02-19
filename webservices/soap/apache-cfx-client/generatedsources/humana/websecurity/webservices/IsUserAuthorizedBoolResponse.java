
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="IsUserAuthorizedBoolResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isUserAuthorizedBoolResult"
})
@XmlRootElement(name = "IsUserAuthorizedBoolResponse")
public class IsUserAuthorizedBoolResponse {

    @XmlElement(name = "IsUserAuthorizedBoolResult")
    protected boolean isUserAuthorizedBoolResult;

    /**
     * Gets the value of the isUserAuthorizedBoolResult property.
     * 
     */
    public boolean isIsUserAuthorizedBoolResult() {
        return isUserAuthorizedBoolResult;
    }

    /**
     * Sets the value of the isUserAuthorizedBoolResult property.
     * 
     */
    public void setIsUserAuthorizedBoolResult(boolean value) {
        this.isUserAuthorizedBoolResult = value;
    }

}
