class Testsum
{   
	
	public static void main(String[] args) 
	{
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30);
	}
	public static void sum(int... x){
		int total=0;
		for(int x1:x){
			total+=x1;
		}
		System.out.println("the sum:"+total);
	}
}

