
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBoolBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBoolBase">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:Humana:WebSecurity:SL:WebService:MessageTypes}ResponseMessageBase">
 *       &lt;sequence>
 *         &lt;element name="ReplyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBoolBase", propOrder = {
    "replyFlag"
})
@XmlSeeAlso({
    ResponseBool.class
})
public class ResponseBoolBase
    extends ResponseMessageBase
{

    @XmlElement(name = "ReplyFlag")
    protected boolean replyFlag;

    /**
     * Gets the value of the replyFlag property.
     * 
     */
    public boolean isReplyFlag() {
        return replyFlag;
    }

    /**
     * Sets the value of the replyFlag property.
     * 
     */
    public void setReplyFlag(boolean value) {
        this.replyFlag = value;
    }

}
