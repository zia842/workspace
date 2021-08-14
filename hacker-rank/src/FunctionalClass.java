
public class FunctionalClass 
{

	public static void main(String []args) {
		
		MyFunction myFn = (text) -> System.out.println(text);
		myFn.apply("Test it Out !!");
		
		
	}
	
	
}
