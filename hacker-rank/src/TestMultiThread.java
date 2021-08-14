import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class TestMultiThread implements Runnable
{

	static Queue<Integer> myQueue = new LinkedList<Integer>();
	
	@Override
	public void run() {
		
		Integer number = myQueue.poll();
		
		for(int i=1;i<=10;i++) {
			//System.out.println("Executing " + Thread.currentThread().getName() + " " + i);
			int result = number * i;
			System.out.println(Integer.toString(number) + " * " + Integer.toString(i) + " = " + result);
		}
		
	}
	
	
	public static void main(String []args) {
		
		TestMultiThread multiThread = new TestMultiThread();
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		myQueue.add(5);
		
		Map<String,String> testMap = new HashMap<String, String>();
		testMap.put(null, "abc");
		testMap.put("def", "abc");
		
		Set entrySet =  testMap.entrySet();
		Iterator itr = entrySet.iterator();
		while(itr.hasNext()) {
			//itr.remove();
			itr.next();
			//testMap.remove(null);
			itr.remove();
			//testMap.remove(null);
		}
		
		
		System.out.println(testMap.get(null));
		
		new Thread(multiThread, "THREAD FOUR").run();
		System.out.println("Im done");
		new Thread(multiThread,"THREAD ONE").start();
		new Thread(multiThread, "THREAD TWO").start();
		new Thread(multiThread, "THREAD THREE").start();
		
		
		
	}

}
