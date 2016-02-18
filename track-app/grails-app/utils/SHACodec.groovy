import java.security.MessageDigest

/**
 * Created by russel on 6/14/14.
 */

/* Secure Hash Algorithm  */
class SHACodec {
  static encode = { target ->
    MessageDigest md = MessageDigest.getInstance('SHA')
    md.update(target.getBytes('UTF-8'))
    return new String(md.digest()).encodeAsBase64()
  }
}