
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
 *         &lt;element name="IsUserAuthorizedBoolWithLoggingExResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isUserAuthorizedBoolWithLoggingExResult"
})
@XmlRootElement(name = "IsUserAuthorizedBoolWithLoggingExResponse")
public class IsUserAuthorizedBoolWithLoggingExResponse {

    @XmlElement(name = "IsUserAuthorizedBoolWithLoggingExResult")
    protected boolean isUserAuthorizedBoolWithLoggingExResult;

    /**
     * Gets the value of the isUserAuthorizedBoolWithLoggingExResult property.
     * 
     */
    public boolean isIsUserAuthorizedBoolWithLoggingExResult() {
        return isUserAuthorizedBoolWithLoggingExResult;
    }

    /**
     * Sets the value of the isUserAuthorizedBoolWithLoggingExResult property.
     * 
     */
    public void setIsUserAuthorizedBoolWithLoggingExResult(boolean value) {
        this.isUserAuthorizedBoolWithLoggingExResult = value;
    }

}
