public interface Thing {
    public void getStuff(String stuff, int number)
    public void putStuff()
}

public abstract class Paper {
    public int howManyPages(int number) {
        int cover = 2
        int preface = 10
        return number + cover + preface
    }
}

public class Book extends Paper implements Thing {
    @Override
    public void getStuff(String stuff, int number) {
        println "I have ${number} ${stuff}"
    }
    @Override
    public void putStuff() {
        println "I put some stuff away"
    }
}

Book book = new Book()
book.getStuff('books', 4)
book.putStuff()
book.howManyPages(200)