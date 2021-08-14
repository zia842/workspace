
public interface MyInterface {
	
	static void show() {
		System.out.println("From My Interface");
	}
	
	default void display() {
		System.out.println("From MyInterface Display");
	}
	

}
