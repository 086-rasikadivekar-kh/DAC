 class OneBHK{
	public double roomArea;
	public double hallArea;
	public int price;
	OneBHK(){
		
	}
	OneBHK(double roomArea,double hallArea,int price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
		
	}
	void show(){
		System.out.println("Area of Room "+roomArea);
		System.out.println("Area of Hall "+hallArea);
		System.out.println("Price is "+price);
		System.out.println("Total Amount of TwoBHK: "+totalAmount1());
		
	}
	double totalAmount1(){
		double total =(roomArea + hallArea)* price;
		return total;
	}
	
}

class TwoBHK extends OneBHK{
	public double room2Area;
	
	TwoBHK(){
		
	}
	
	TwoBHK(double room2Area,double roomArea,double hallArea,int price){
		super(roomArea,hallArea,price);
		this.room2Area=room2Area;
		
	}
	void  show(){
		super.show();
		System.out.println("Area of TwoBHK Room "+room2Area);
		System.out.println("Total Amount of TwoBHK: "+totalAmount());
	}
	double totalAmount(){
		double total =(room2Area + roomArea + hallArea)* price;
		return total;
	}
}

class Que43{
	public static void main(String args[]){
		TwoBHK t = new TwoBHK(20.2,10.2,23.1,100);
		t.show();
		TwoBHK t1 = new TwoBHK(21.3,9.5,22.1,100);
		t1.show();
		TwoBHK t2 = new TwoBHK(20.5,8.5,5.36,100);
		t2.show();
		
		
		
	}
}