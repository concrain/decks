import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Three implements Callable<Boolean> {

    public Boolean call() throws Exception {
        System.out.print("Three...");
        Thread.sleep(3000);
        System.out.print("Three!!\n");
        return true;
    }
}
