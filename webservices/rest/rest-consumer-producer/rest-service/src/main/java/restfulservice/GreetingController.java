package restfulservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {

      /** using POJO */
      Greeting g = new Greeting();
      g.setId(counter.incrementAndGet());
      g.setContent(String.format(template, name));
      log.info("id: " + g.getId() + " ,response: " + g.getContent());
      return g;
      /** */

      /** using the constructor
      return new Greeting(counter.incrementAndGet(), String.format(template, name));
      /** */
    }
}
