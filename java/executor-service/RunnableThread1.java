

public class RunnableThread1 implements Runnable {    
	
	private String myName;
	private int count;
	private final long timeSleep;
	boolean lock = false;

	RunnableThread1(String name, int newcount, long newtimeSleep) {
		this.myName = name;
	    this.count = newcount;
	    this.timeSleep = newtimeSleep;
	}
	
	
	@Override
	public void run() {
	  
		int sum = 0;
	    for (int i = 1; i <= this.count; i++) {
	    	sum = sum + i;
	    }
	    System.out.println(myName +" thread has sum = "+ sum +" and is going to sleep for "+ timeSleep +"\n");
	    try {
			Thread.sleep(this.timeSleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
}