
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestGetFuncListForSysAppBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestGetFuncListForSysAppBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemApplicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestGetFuncListForSysAppBase", propOrder = {
    "systemApplicationId"
})
@XmlSeeAlso({
    RequestGetFuncListForSysApp.class
})
public class RequestGetFuncListForSysAppBase {

    @XmlElement(name = "SystemApplicationId")
    protected int systemApplicationId;

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

}
