package restfulservice;

public class QueryBuilder {

    private String field;
    private String value;

    public QueryBuilder() {
    }

    public QueryBuilder(String field, String value) {
        this.field = field;
        this.value = value;
    }

    public String getfield() {
        return field;
    }

    public String getValue() {
        return value;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setValue(String value) {
        this.value = value;
    }
}