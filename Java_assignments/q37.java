Q. 37

class Person{
	private int age;
	private String name;
	Person(){
		System.out.println("In constructor");
		age = 18;
		name = "Ram";
	}

	void display(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

class Que37{
	public static void main(String []a){
		Person p1 = new Person();

		p1.display();	

	}
}


