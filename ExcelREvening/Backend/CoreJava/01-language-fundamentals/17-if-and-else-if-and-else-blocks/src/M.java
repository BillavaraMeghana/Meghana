/*
If n is odd,print weird
If n is even and in the inclusive range 2 to 5,print not weird
*/
class M
{
	public static void main(String[] args) 
	{
		int N = 4;
		if(N % 2 != 0)
		{
		    System.out.println("Weird");
		}
		else if(N % 2 == 0 && N >= 2 && N <= 5)
		{
			System.out.println("Not Weird");
		}
        else if(N % 2 == 0 && N >= 6 && N <= 20)
		{
			System.out.println("Weird");
		}
		else if(N % 2 == 0 && N > 20 && N <= 100)
		{
			System.out.println(" Not Weird");
		}
	}
}
