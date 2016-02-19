
package humana.websecurity.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="GetAccessIDsForCCRsResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "getAccessIDsForCCRsResult"
})
@XmlRootElement(name = "GetAccessIDsForCCRsResponse")
public class GetAccessIDsForCCRsResponse {

    @XmlElement(name = "GetAccessIDsForCCRsResult")
    protected GetAccessIDsForCCRsResponse.GetAccessIDsForCCRsResult getAccessIDsForCCRsResult;

    /**
     * Gets the value of the getAccessIDsForCCRsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccessIDsForCCRsResponse.GetAccessIDsForCCRsResult }
     *     
     */
    public GetAccessIDsForCCRsResponse.GetAccessIDsForCCRsResult getGetAccessIDsForCCRsResult() {
        return getAccessIDsForCCRsResult;
    }

    /**
     * Sets the value of the getAccessIDsForCCRsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccessIDsForCCRsResponse.GetAccessIDsForCCRsResult }
     *     
     */
    public void setGetAccessIDsForCCRsResult(GetAccessIDsForCCRsResponse.GetAccessIDsForCCRsResult value) {
        this.getAccessIDsForCCRsResult = value;
    }


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
     *         &lt;any/>
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
        "any"
    })
    public static class GetAccessIDsForCCRsResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
