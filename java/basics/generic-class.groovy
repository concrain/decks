public class MyType<T> {

    private T myVal;
    
    public MyType(T newValue) {
        myVal = newValue;
    }
    
    public T getValue(){
        return myVal;
    }
    public void setValue(T newValue) {
        this.myVal = newValue;
    }
    
    public String describe() {
        return myVal.getClass().toString();
    }
}

MyType<String> stringType = new MyType<>("Hello");
stringType.setValue("World");
printf("My generic class type is %s, with a value of '%s'", stringType.describe(), stringType.getValue());