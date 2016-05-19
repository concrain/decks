import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Two implements Callable<String> {

    public String call() throws Exception {
        System.out.print("Two...");
        Thread.sleep(2000);
        System.out.print("Two!!\n");
        return "Done";
    }
}
