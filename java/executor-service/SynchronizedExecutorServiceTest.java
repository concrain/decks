
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SynchronizedExecutorServiceTest {
    
    private static int numOfThreads =2;
    private static boolean lock = true;
    
    private static Future thread1Task2 = null;
    private static Future thread1Task3 = null;
    
    private static Future thread2Task2 = null;
    private static Future thread2Task3 = null;
    
    public static synchronized void testThreads() throws InterruptedException, ExecutionException {
        
        ExecutorService executor = Executors.newSingleThreadExecutor();           // one thread in sequence
        //ExecutorService executor = Executors.newFixedThreadPool(numOfThreads);    // multiple threads in sequence
        //ExecutorService executor = Executors.newCachedThreadPool();               // generates as many threads needed to run all at once

       
        Runnable thread1Task1 = new RunnableThread1("Thread2-Task2", 2, 500);
        Runnable thread2Task1 = new RunnableThread2("Thread2-Task1", 2, 500);
        
        executor.execute( thread1Task1 );
        executor.execute( thread2Task1 );
        
        for(int i = 0; i < numOfThreads; i++) {
            // thread-1
            if ((thread1Task2 == null) || (thread1Task2.isDone()) || (thread1Task2.isCancelled())) {
                thread1Task2 = executor.submit(new RunnableThread1("Thread1-Task2", 4, 200));
            }
    
            if ((thread1Task3 == null) || (thread1Task3.isDone()) || (thread1Task3.isCancelled())) {
                thread1Task3 = executor.submit(new RunnableThread1("Thread1-Task3", 5, 200));
            }
            
            if(thread1Task2.get() == null) { System.out.println(i+1 + ") Thread1-Task2 terminated"); }
            else { thread1Task2.cancel(true); }
            if(thread1Task3.get() == null) { System.out.println(i+1 + ") Thread1-Task3 terminated"); }
            else { thread1Task3.cancel(true); }
            
            // thread-2
            if ((thread2Task2 == null) || (thread2Task2.isDone()) || (thread2Task2.isCancelled())) {
                thread2Task2 = executor.submit(new RunnableThread2("Thread2-Task2", 4, 200));
            }
    
            if ((thread2Task3 == null) || (thread2Task3.isDone()) || (thread2Task3.isCancelled())) {
                thread2Task3 = executor.submit(new RunnableThread2("Thread2-Task3", 5, 200));
            }
            
            if(thread2Task2.get() == null) { System.out.println(i+1 + ") Thread2-Task2 terminated"); }
            else { thread2Task2.cancel(true); }
            if(thread2Task3.get() == null) { System.out.println(i+1 + ") Thread2-Task3 terminated"); }
            else { thread2Task3.cancel(true); }
        }

        executor.shutdown();
        System.out.println("-----------------------");

        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("All tasks are finished!");
    }
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        testThreads();
    }

}