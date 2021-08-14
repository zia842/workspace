import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize {
	
	public static void main(String []args) throws Exception {
		
		FileInputStream fis = new FileInputStream("stud.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student)ois.readObject();
		
		System.out.println(s.getStudentID());
		System.out.println(s.getStudentName());
	}

}
