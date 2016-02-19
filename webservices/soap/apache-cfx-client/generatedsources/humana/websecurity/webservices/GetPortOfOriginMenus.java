
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
 *         &lt;element name="portOfOrigin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="menuLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "portOfOrigin",
    "menuLevel",
    "menuGenKey"
})
@XmlRootElement(name = "GetPortOfOriginMenus")
public class GetPortOfOriginMenus {

    protected int portOfOrigin;
    protected int menuLevel;
    protected int menuGenKey;

    /**
     * Gets the value of the portOfOrigin property.
     * 
     */
    public int getPortOfOrigin() {
        return portOfOrigin;
    }

    /**
     * Sets the value of the portOfOrigin property.
     * 
     */
    public void setPortOfOrigin(int value) {
        this.portOfOrigin = value;
    }

    /**
     * Gets the value of the menuLevel property.
     * 
     */
    public int getMenuLevel() {
        return menuLevel;
    }

    /**
     * Sets the value of the menuLevel property.
     * 
     */
    public void setMenuLevel(int value) {
        this.menuLevel = value;
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
