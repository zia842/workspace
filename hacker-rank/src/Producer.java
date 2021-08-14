import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	BlockingQueue<String> blockingQueue = null;
	
	public Producer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	@Override
	public void run() 
	{
		while(true) {
			long time = System.currentTimeMillis();
			this.blockingQueue.add("" + time);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	

}
