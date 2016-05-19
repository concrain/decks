import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class FutureExecutorTest {

    public void print(String m) {
        System.out.println(m);
    }

    /**
     * @See java.util.concurrent.Future.get() doc
     *      <p>
     *      Waits if necessary for the computation to complete, and then
     *      retrieves its result.
     */
    @Test
    public void poolRun() throws InterruptedException, ExecutionException {
        int n = 3;
        // Build a fixed number of thread pool
        ExecutorService pool = Executors.newFixedThreadPool(n);
        // Wait until One finishes it's task.
        pool.submit(new One()).get();
        // Wait until Two finishes it's task.
        pool.submit(new Two()).get();
        // Wait until Three finishes it's task.
        pool.submit(new Three()).get();
        pool.shutdown();
    }
}
