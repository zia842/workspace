import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient String name;
	int age;
	int jobId;

	// Default constructor
	public SerializableDemo(String name, int age, int jobId)
	{
		// This keyword is used to refer
		// current object instance
		this.name = name;
		this.age = age;
		this.jobId = jobId;
	}

	public static void main(String[] args) throws Exception
	{

		// Creating an object of class in main() method
		SerializableDemo t1 = new SerializableDemo("Ram", 34, 2364);

		// Serialization

		// Saving of object in a file
		FileOutputStream fos = new FileOutputStream("abc1.ser");
		ObjectOutputStream oos 	= new ObjectOutputStream(fos);

		// Method for serialization of object
		oos.writeObject(t1);

		System.out.println("Object has been serialized");
		// Deserialization

		// Reading the object from a file
		FileInputStream fis = new FileInputStream("abc1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Method for deserialization of object
		SerializableDemo t2 = (SerializableDemo)ois.readObject();

		// Display message only
		System.out.println("Object has been deserialized ");

		// Print and display the name and age
		// to illustrate Serializable
		System.out.println("Name:" + t2.name + "\n"
				+ "Age:" + t2.age + "\n"
				+ t2.jobId);
	}

}
