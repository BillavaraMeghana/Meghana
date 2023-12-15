class U
{

    int i;

	static U test()
	{
	     return new U();//while returning we can also pass object
	}
	public static void main(String[] args) 
	{
		U obj = test();
		System.out.println("main end: " + obj.i);
	}
}
