import numserve.DelayLine
import numserve.NumberHelper
import ratpack.groovy.template.TextTemplateModule

import static ratpack.groovy.Groovy.groovyTemplate
import static ratpack.groovy.Groovy.*

ratpack {
  bindings {
    add TextTemplateModule
  }

  handlers {

    get('num/:lang/:text') { c ->
      DelayLine.instance.render(c, NumberHelper.instance.toNum(c.pathTokens.lang, c.pathTokens.text))
    }
    get('text/:lang/:num') { c ->
      DelayLine.instance.render(c, NumberHelper.instance.toText(c.pathTokens.lang, c.pathTokens.num))
    }
    get('random') { c ->
      render NumberHelper.instance.random()
    }
    get('num2') { c ->
      DelayLine.instance.render(c, NumberHelper.instance.toNum(c.request.queryParams.lang, c.request.queryParams.text))
    }
    get('text2') { c ->
      DelayLine.instance.render(c, NumberHelper.instance.toText(c.request.queryParams.lang, c.request.queryParams.num))
    }

    get {
      render groovyTemplate("index.html", title: "My Ratpack App")
    }

    assets "public"
  }
}
