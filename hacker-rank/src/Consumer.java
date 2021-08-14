import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	BlockingQueue<String> blockingQueue = null;
	
	public Consumer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}
	
	@Override
	public void run() 
	{
		while(true) {
			try 
			{
				System.out.println(this.blockingQueue.take());
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
