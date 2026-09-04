package tasktwo;
class person{
	int age;
	String name;
void getperson(String name,int age) {
	this.age=age; //this data type is used to declare the particular data in that method
	this.name=name;
}
}
class student extends person{ //student class inherit person class
	int rollno;
	void getstudent(int rollno) {
	this.rollno=rollno; 
	}
	void display() {
		System.out.println("Age is :"+ this.age);
		System.out.println("Name is :"+this.name);
		System.out.println("Rollno is:"+this.rollno);
		
	}
}
class faculty extends person{           //faculty class inherit person class
	String subject;
	int experince;
	void getfaculty(String subject) {
		this.subject=subject;
	}

		void display() {
	
		System.out.println("Subject is :"+this.subject);
		System.out.println("Name is:"+this.name);
		System.out.println("age is:"+this.age);
		
	}
}
public class PartC {
	public static void main(String[] args) {
		 student s= new student();
	        s.getperson("Srikar", 19);
	        s.getstudent(238);
	        faculty f= new faculty();
	        f.getperson("santhosh",43);
	        f.getfaculty( "java");
	        
	s.display();
	f.display();

}
}