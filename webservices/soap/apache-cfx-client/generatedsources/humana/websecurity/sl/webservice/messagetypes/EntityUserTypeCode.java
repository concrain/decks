
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityUserTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityUserTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="PAA"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="OA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityUserTypeCode")
@XmlEnum
public enum EntityUserTypeCode {

    @XmlEnumValue("All")
    ALL("All"),
    PAA("PAA"),
    AA("AA"),
    OA("OA");
    private final String value;

    EntityUserTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityUserTypeCode fromValue(String v) {
        for (EntityUserTypeCode c: EntityUserTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
