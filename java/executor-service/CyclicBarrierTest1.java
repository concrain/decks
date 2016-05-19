import java.util.concurrent.*;

public class CyclicBarrierTest1
{
    public static void main(String[] args) {
        
        Runnable barrier1Action1 = new Runnable() { public void run() { System.out.println("\nBarrierAction 1 executed "); } };
        Runnable barrier2Action2 = new Runnable() { public void run() { System.out.println("\nBarrierAction 2 executed "); } };
        
        CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action1);
        CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action2);
        
        CyclicBarrierRunnable barrierRunnable1 = new CyclicBarrierRunnable(barrier1, barrier2);
        CyclicBarrierRunnable barrierRunnable2 = new CyclicBarrierRunnable(barrier1, barrier2);
        
        new Thread(barrierRunnable1).start();
        new Thread(barrierRunnable2).start();
    }

}
