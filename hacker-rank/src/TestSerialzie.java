import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialzie implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient static private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		TestSerialzie.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public static void main(String []args) {
		
		TestSerialzie t = new TestSerialzie();
		//t.setAge(10);
		t.setName("Test");
		FileOutputStream fos = null;
		ObjectOutputStream os = null;
		
		try 
		{
			fos = new FileOutputStream("test.ser");
			os = new ObjectOutputStream(fos);
			os.writeObject(t);
			
			t.setAge(25);
			
			FileInputStream fis = new FileInputStream("test.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			TestSerialzie t2 = (TestSerialzie)ois.readObject();
			System.out.println(t2.getAge());
			System.out.println(t2.getName());
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			try {
				os.close();
				fos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		
	}

}
