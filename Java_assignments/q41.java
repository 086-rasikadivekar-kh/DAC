class Student{
	private int rollno;
	private String name;

	Student(){
		this(100,"neha");
		System.out.println("no-argument constructor");
	}

	Student(int rollno, String name){
		//this();
		this.rollno = rollno;
		this.name = name;
		System.out.println("Param argument constructor");
	}

	void show(){
		System.out.println(rollno+" "+name);
	}
}

class Que41{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.show();
	}
}
s
