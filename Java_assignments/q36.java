class mathOperation{
	void multiply(int n1, int n2){
		int mul = n1*n2;
		System.out.println("1st output: "+mul);
	}

	void multiply(float n1, float n2, float n3){
		double mul = n1*n2*n3;
		System.out.println("2st output: "+mul);
	}

	void multiply(int [] arr){
		int mul=1;
		for(int i=0; i<arr.length;i++)
		{
			 mul=mul*arr[i];
		}
		System.out.println("3rd output: "+mul);
	}

	void multiply(double n1, int n2){
		double mul = n1*n2;
		System.out.println("4th output: "+mul);
	}
}