import java.util.Scanner;

class Product{
	int pid;
	int price;
	int quantity;

	Product(int pid, int price, int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}

	static int calc(Product [] arr)
	{
		int amount;
		int totalAmount=0;
		for(int i=0; i<arr.length; i++)
		{
			amount = arr[i].price * arr[i].quantity;
			totalAmount = totalAmount+amount;

			System.out.println("pid: "+arr[i].pid+" amount = "+amount);
		}	
		return totalAmount;
	}
}

class Que39{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		Product arr[] = new Product[5];

		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter pid: ");
			int pid=sc.nextInt();	
			System.out.println("Enter price: ");
			int price=sc.nextInt();	
			System.out.println("Enter quantity: ");
			int quantity=sc.nextInt();	

			Product p = new Product(pid,price,quantity);
			arr[i] = p;		
		}

		int total = Product.calc(arr);

		System.out.println("Total Amount = "+total);

		
	}
}
