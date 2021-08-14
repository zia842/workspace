import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	
	public static void main(String []args) throws Exception {
		
		Student s = new Student();
		s.setStudentID(300);
		s.setStudentName("Test");
		FileOutputStream fos = new FileOutputStream("stud.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(s);
		
		
	}

}
