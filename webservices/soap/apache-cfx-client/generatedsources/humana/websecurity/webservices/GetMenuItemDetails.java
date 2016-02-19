
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
 *         &lt;element name="menuGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="businessFunctionGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "menuGenKey",
    "businessFunctionGenKey"
})
@XmlRootElement(name = "GetMenuItemDetails")
public class GetMenuItemDetails {

    protected int menuGenKey;
    protected int businessFunctionGenKey;

    /**
     * Gets the value of the menuGenKey property.
     * 
     */
    public int getMenuGenKey() {
        return menuGenKey;
    }

    /**
     * Sets the value of the menuGenKey property.
     * 
     */
    public void setMenuGenKey(int value) {
        this.menuGenKey = value;
    }

    /**
     * Gets the value of the businessFunctionGenKey property.
     * 
     */
    public int getBusinessFunctionGenKey() {
        return businessFunctionGenKey;
    }

    /**
     * Sets the value of the businessFunctionGenKey property.
     * 
     */
    public void setBusinessFunctionGenKey(int value) {
        this.businessFunctionGenKey = value;
    }

}
