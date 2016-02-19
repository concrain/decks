
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import humana.websecurity.sl.webservice.messagetypes.RequestGetFuncListForSysApp;


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
 *         &lt;element ref="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}RequestGetFuncListForSysApp" minOccurs="0"/>
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
    "requestGetFuncListForSysApp"
})
@XmlRootElement(name = "GetFunctionListForSystemApplication")
public class GetFunctionListForSystemApplication {

    @XmlElement(name = "RequestGetFuncListForSysApp", namespace = "urn:Humana:WebSecurity:SL:WebService:MessageTypes")
    protected RequestGetFuncListForSysApp requestGetFuncListForSysApp;

    /**
     * Gets the value of the requestGetFuncListForSysApp property.
     * 
     * @return
     *     possible object is
     *     {@link RequestGetFuncListForSysApp }
     *     
     */
    public RequestGetFuncListForSysApp getRequestGetFuncListForSysApp() {
        return requestGetFuncListForSysApp;
    }

    /**
     * Sets the value of the requestGetFuncListForSysApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestGetFuncListForSysApp }
     *     
     */
    public void setRequestGetFuncListForSysApp(RequestGetFuncListForSysApp value) {
        this.requestGetFuncListForSysApp = value;
    }

}
