class Employee{
	static int empNo=0;
	int salary;
	static int totalSalary=0;

	Employee(int salary){
		empNo++;
		this.salary=salary;
		totalSalary=totalSalary+salary;
	}

	void display(){
		System.out.println("Total Employee = "+ empNo +" Total Salary = "+ totalSalary);
	}
}

class Que38{
	public static void main(String a[]){
		int arr[]=new int[3];
	
		Employee e1 = new Employee(2000);
		e1.display();
		Employee e2 = new Employee(2000);
		e2.display();
		Employee e3 = new Employee(2000);
		e3.display();

	}

}