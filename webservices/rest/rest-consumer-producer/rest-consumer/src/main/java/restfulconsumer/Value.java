package restfulconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String content;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", content='" +  content + '\'' +
                '}';
    }
}
