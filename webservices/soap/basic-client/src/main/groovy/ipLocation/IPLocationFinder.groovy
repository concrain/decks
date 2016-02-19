package ipLocation

import ipLocation.net.webservicex.GeoIP
import ipLocation.net.webservicex.GeoIPService
import ipLocation.net.webservicex.GeoIPServiceSoap

class IPLocationFinder {

	public static void main(String[] args) {

		if(args.length != 1) {
			println('You need to pass in one IP Address')
		} else {
			String ipAddress = args[0]
			// calling SEI
			GeoIPService ipService = new GeoIPService()
      GeoIPServiceSoap geoIpServiceSoap = ipService.getGeoIPServiceSoap()   // the stub
      GeoIP geoIP = geoIpServiceSoap.getGeoIP(ipAddress)
      println('Country name: ' + geoIP.getCountryName())
		}
	}
}