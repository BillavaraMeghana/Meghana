class E
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++ + i + i++ + i;//0 + 1 + 
		System.out.println(i);//2
		System.out.println(j);//4
	}
}
//i = 0, 1