class Factorial
{
	public static void main(String args[])
	{
		int n = 5,fact=1;
		for(int i=n;i>=1;i--)
		{
			fact = fact * i;
		}
		System.out.println("factorial of n is "+fact);
	}
}
