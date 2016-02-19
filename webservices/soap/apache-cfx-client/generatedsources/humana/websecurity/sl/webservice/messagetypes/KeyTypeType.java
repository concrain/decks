
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccessIdTypeCode"/>
 *     &lt;enumeration value="BusinessFunction"/>
 *     &lt;enumeration value="Entity"/>
 *     &lt;enumeration value="MenuTemplate"/>
 *     &lt;enumeration value="PortOfOrigin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KeyTypeType")
@XmlEnum
public enum KeyTypeType {

    @XmlEnumValue("AccessIdTypeCode")
    ACCESS_ID_TYPE_CODE("AccessIdTypeCode"),
    @XmlEnumValue("BusinessFunction")
    BUSINESS_FUNCTION("BusinessFunction"),
    @XmlEnumValue("Entity")
    ENTITY("Entity"),
    @XmlEnumValue("MenuTemplate")
    MENU_TEMPLATE("MenuTemplate"),
    @XmlEnumValue("PortOfOrigin")
    PORT_OF_ORIGIN("PortOfOrigin");
    private final String value;

    KeyTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyTypeType fromValue(String v) {
        for (KeyTypeType c: KeyTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
