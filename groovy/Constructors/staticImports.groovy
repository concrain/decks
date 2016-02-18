// Normal Java static import.
import static HttpURLConnection.HTTP_OK
import static HttpURLConnection.HTTP_OK as okay
import static HttpURLConnection.setFollowRedirects as redirect

// Non static import.
import java.net.HttpURLConnection as http
redirect false  // HttpURLConnection.setFollowRedirects(false)

assert false == HttpURLConnection.followRedirects

def c = (http) 'http://www.mrhaki.com/'.toURL().openConnection()

assert c instanceof HttpURLConnection
assert okay == c.responseCode
assert HTTP_OK == c.responseCode