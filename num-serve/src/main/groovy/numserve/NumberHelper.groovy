package numserve

import com.ibm.icu.text.RuleBasedNumberFormat
import com.ibm.icu.util.ULocale
import groovy.json.JsonBuilder
import groovy.transform.Memoized
import groovy.util.logging.Slf4j

/**
 * Created by rahulsomasunderam on 04/03/15.
 */
@Singleton
@Slf4j
class NumberHelper {

  private Random random = new Random()

  @Memoized
  RuleBasedNumberFormat getNumberFormat(String language) {
    try {
      def locale = ULocale.availableLocales.find { it.toString() == language }
      def numberFormat = new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT)
      log.info "Created Formatter for '${language}'"
      return numberFormat
    } catch (Exception e) {
      log.warn "Could not create Formatter for '${language}'"
      null
    }
  }

  String toText(String language, String number) {
    def format = getNumberFormat(language)
    if (format) {
      def text = format.format(new BigDecimal(number))
      log.info "[$language] $number -> ${text}"
      text
    } else {
      throw new IllegalArgumentException("Invalid language '$language'")
    }
  }

  String toNum(String language, String text) {
    def format = getNumberFormat(language)
    if (format) {
      def number = format.parse(text)
      log.info "[$language] $text -> ${number}"
      number
    } else {
      throw new IllegalArgumentException("Invalid language '$language'")
    }
  }

  String random() {

    def locales = ULocale.availableLocales.sort(false) {it.toString()}
    def idx = random.nextInt(locales.size())
    def language = locales[idx]

    def format = getNumberFormat(language.toString())
    def num = random.nextInt(1000000)

    def retval = [code: language.toString(), text: format.format(num), num: num]
    new JsonBuilder(retval).toString()

  }
}
