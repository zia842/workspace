
public class TestClone {

	
	public static void main(String []args) throws CloneNotSupportedException {
		
		Employee e = new Employee();
		e.setEmpName("Zia");
		e.setEmpNo(1);
		Address a = new Address();
		a.setAddress("11111");
		e.setAddress(a);
		a.setAptNo(1000);
		
		Employee e2 = (Employee)e.clone();
		
		Employee e1 = e;
		
		e1.setEmpName("Test");
		e1.setEmpNo(2);
		
		Address a1 = e2.getAddress();
		a1.setAddress("2222");
		a.setAptNo(20000);
		
		System.out.println(e1.getEmpName());
		System.out.println(e.getEmpName());
		System.out.println(e2.getEmpName());
		System.out.println(e1.getEmpNo());
		System.out.println(e.getEmpNo());
		System.out.println(e2.getEmpNo());
		
		System.out.println(e2.getAddress().getAddress());
		System.out.println(e2.getAddress().getAptNo());
		System.out.println(e.getAddress().getAddress());
		System.out.println(e.getAddress().getAptNo());
		
	}
	
}
