class R
{
	//while declaring itself we cannot use unary operators
	static int i++;
	static int j++;

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
