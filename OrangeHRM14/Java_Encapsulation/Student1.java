package Java_Encapsulation;

public class Student1 {
	
	 int sno,sphone;
	 
	 
	 Student1(int sno1,int sphone1)
	 {
		 this.sno=sno1;
		 this.sphone=sphone1;
	 }
	 
	 Student1()
	 {
		 //this.sno=104;
		//this.sphone=1111;
	 }
	 

	public static void main(String[] args) {
	
		Student1 s1=new Student1(100,42234234);
		s1.displaystudentdata();
		
		Student1 s2=new Student1(200,435345);
		s2.displaystudentdata();
		
		Student1 s3=new Student1();
		s3.displaystudentdata();
		
	}
	
	
	public void displaystudentdata()
	{
		
		System.out.println("Student no:"+sno);
		System.out.println("Student sphone:"+sphone);
	}
	
	
	

}
