package util
/**
 * Created by rahul on 3/6/15.
 */
class DataSource {
  static Reader getReader() {
    DataSource.classLoader.getResourceAsStream('input.10.csv').newReader()
  }
  static List<String> getLines() {
    DataSource.classLoader.getResourceAsStream('input.10.csv').readLines()
  }
}
