import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.BiConsumer;

public class ProducerConsumerExample {
	
	public static void main(String []args) {
		
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);
		
		
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		Method methods[] = producer.getClass().getMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		
		String s = "abcdef";
		StringBuilder sb = new StringBuilder();
		sb.reverse();
		
		
		
		BiConsumer<Integer, Integer> biConsumer =  (a1,b)-> System.out.println(a1+b);
		biConsumer.accept(10, 20);
		
		String result = "";
		for(Character c : s.toCharArray()) {
			result = String.valueOf(c) + result;
		}
		
		System.out.println(result);
		System.out.println(100 + 100 + "test");
		System.out.println("test" + 100 + 100);
		
		final int a = 10;
		test(10,20);
		test(10.25f,20);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
		
		
		
	}
	
	
	public static void test(int a, int b) {
		System.out.println("Integer " + (a+b));
	}
	
	public static void test(float a, int b) {
		System.out.println("Float" + (a+b));
	}

}
