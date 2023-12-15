class M18
{
	public static void main(String[] args) 
	{
		System.out.println("browser begin");
		website();
		System.out.println("browser end");
	}
	static void website()
	{
		System.out.println("website begin");
		int age = 15;
		if(age == 18)
		{
		   return;
		}
		System.out.println("continue end");
	}
}
