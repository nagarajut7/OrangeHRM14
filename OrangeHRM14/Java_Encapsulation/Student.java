package Java_Encapsulation;



public class Student {
	

	private int sno;
	private String sname,saddress;

	public static void main(String[] args) {
	
		Student s1=new Student();
		s1.setSno(100);
		s1.setSname("Venkat");
		s1.setSaddress("KPHB Hyderabad");
		s1.studentdata();
		
		
		System.out.println("S1 Number is "+s1.getSno());
		System.out.println("S1 Name is "+s1.getSname());
		System.out.println("S1 address is "+s1.getSaddress());
		
		
		System.out.println(".................");
		
		Student s2=new Student();
		s2.setSno(200);
		s2.setSname("Ravi");
		s2.setSaddress("Miyapur Hyderabad");
		s2.studentdata();
		
		
	}
	
	public void studentdata()
	{
		System.out.println("Student no:"+sno);
		System.out.println("Student sname:"+sname);
		System.out.println("Student saddress:"+saddress);
		
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	
	
	

}
