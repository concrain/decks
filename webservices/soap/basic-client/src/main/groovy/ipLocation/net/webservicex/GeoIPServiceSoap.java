
package ipLocation.net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GeoIPServiceSoap", targetNamespace = "http://www.webservicex.net/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GeoIPServiceSoap {


    /**
     * GeoIPService - GetGeoIP enables you to easily look up countries by IP addresses
     * 
     * @param ipAddress
     * @return
     *     returns net.webservicex.GeoIP
     */
    @WebMethod(operationName = "GetGeoIP", action = "http://www.webservicex.net/GetGeoIP")
    @WebResult(name = "GetGeoIPResult", targetNamespace = "http://www.webservicex.net/")
    @RequestWrapper(localName = "GetGeoIP", targetNamespace = "http://www.webservicex.net/", className = "net.webservicex.GetGeoIP")
    @ResponseWrapper(localName = "GetGeoIPResponse", targetNamespace = "http://www.webservicex.net/", className = "net.webservicex.GetGeoIPResponse")
    public GeoIP getGeoIP(
        @WebParam(name = "IPAddress", targetNamespace = "http://www.webservicex.net/")
        String ipAddress);

    /**
     * GeoIPService - GetGeoIPContext enables you to easily look up countries by Context
     * 
     * @return
     *     returns net.webservicex.GeoIP
     */
    @WebMethod(operationName = "GetGeoIPContext", action = "http://www.webservicex.net/GetGeoIPContext")
    @WebResult(name = "GetGeoIPContextResult", targetNamespace = "http://www.webservicex.net/")
    @RequestWrapper(localName = "GetGeoIPContext", targetNamespace = "http://www.webservicex.net/", className = "net.webservicex.GetGeoIPContext")
    @ResponseWrapper(localName = "GetGeoIPContextResponse", targetNamespace = "http://www.webservicex.net/", className = "net.webservicex.GetGeoIPContextResponse")
    public GeoIP getGeoIPContext();

}
