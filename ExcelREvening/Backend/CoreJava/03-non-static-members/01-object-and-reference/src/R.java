class R 
{
	int i;

	void test(R ref)
	{
		System.out.println("from test(R) begin: " + ref.i);
		ref.i = 20;
		System.out.println("from test(R) end: " + ref.i);
	}

	public static void main(String[] args) 
	{
		R r1 = new R();
		System.out.println("main begin: " + r1.i);
		r1.i = 10;
		System.out.println("before calling the test(R) method: " + r1.i);
		r1.test(r1);
		System.out.println("after calling the test(R) method: " + r1.i);
	}
}
/*
changes in the destination reflecting to the source ==> call by reference or
pass by reference
If you are sending the reference there is 100% of object modification.
reference ==> key to object
*/