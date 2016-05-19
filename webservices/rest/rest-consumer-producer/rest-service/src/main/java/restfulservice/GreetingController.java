package restfulservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // http://localhost:8080/greeting?name=User
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
	
	// http://localhost:9001/queryTest/table=logger;query=insert;key=uuid;keyValue=12;name=first_name,last_name;nameTest=R,A;value=Russel,Arthur
	@RequestMapping(value = "queryTest/{str}", produces = "text/plain")
	public String queryTest(@PathVariable String str,
						  @MatrixVariable String table,
						  @MatrixVariable String query,
					      @MatrixVariable String key,
					      @MatrixVariable String keyValue,
	                      @MatrixVariable String[] name,
	                      @MatrixVariable String[] nameTest,
	                      @MatrixVariable String[] value) {

//	    StringBuilder result = new StringBuilder();
//	    result.append("table: " + table);
//	    result.append("key: ");
//	    k.ifPresent(value -> result.append(value));
//	    result.append(", value: ");
//	    v.ifPresent(value -> result.append(value));

		List<String> columnNames = new ArrayList<String>();
		List<String> columnNamesTest = new ArrayList<String>();
		List<String> columnValues = new ArrayList<String>();
		for (String n : name) { columnNames.add(n); }
		for (String n : nameTest) { columnNamesTest.add(n); }
		for (String v : value) { columnValues.add(v); }
		
		StringBuilder result = new StringBuilder();
		result.append("tableName: " + table);
		result.append(" queryType: " + query);
		result.append(" primaryKey: " + key);
		result.append(" primaryKeyValue: " + keyValue);
		result.append(" columnNames: " + columnNames);
		result.append(" columnNamesTest: " + columnNamesTest);
		result.append(" columnValues: " + columnValues);
	    log.info(result.toString());

	    // tableName: logger queryType: insert primaryKey: uuid primaryKeyValue: 12 columnNames: [first_name, last_name] columnNamesTest: [R, A] columnValues: [Russel, Arthur]
	    return result.toString();
	}
}
