
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
 *         &lt;element name="akaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessFunctionGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="menuGenKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "akaName",
    "businessFunctionGenKey",
    "menuGenKey"
})
@XmlRootElement(name = "GetUserEntitySegmentList")
public class GetUserEntitySegmentList {

    protected String akaName;
    protected int businessFunctionGenKey;
    protected int menuGenKey;

    /**
     * Gets the value of the akaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkaName() {
        return akaName;
    }

    /**
     * Sets the value of the akaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkaName(String value) {
        this.akaName = value;
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

}
