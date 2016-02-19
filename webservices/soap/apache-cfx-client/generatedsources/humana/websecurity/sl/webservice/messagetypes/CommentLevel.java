
package humana.websecurity.sl.webservice.messagetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommentLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Information"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommentLevel")
@XmlEnum
public enum CommentLevel {

    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    CommentLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentLevel fromValue(String v) {
        for (CommentLevel c: CommentLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
