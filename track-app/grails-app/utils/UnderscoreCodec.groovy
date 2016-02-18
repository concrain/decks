/**
 * Created by russel on 6/14/14.
 */
class UnderscoreCodec {

  static encode = { target ->
    target.replaceAll(" ", "_")
  }

  static decode = { target ->
    target.replaceAll("_"," ")
  }
}
