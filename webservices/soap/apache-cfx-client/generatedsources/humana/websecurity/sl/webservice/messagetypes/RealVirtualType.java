
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealVirtualType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RealVirtualType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Real"/>
 *     &lt;enumeration value="Virtual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RealVirtualType")
@XmlEnum
public enum RealVirtualType {

    @XmlEnumValue("Real")
    REAL("Real"),
    @XmlEnumValue("Virtual")
    VIRTUAL("Virtual");
    private final String value;

    RealVirtualType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RealVirtualType fromValue(String v) {
        for (RealVirtualType c: RealVirtualType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
