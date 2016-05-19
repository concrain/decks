import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class One implements Callable<Integer> {

    public Integer call() throws Exception {
        System.out.print("One...");
        Thread.sleep(1000);
        System.out.print("One!!\n");
        return 100;
    }
}
