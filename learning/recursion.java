// Implimenting fibannaci with recursion

public class recursion
{
	public static void main(String[] args)
	{
		System.out.println(fib(4));
	}

	public static int fib(int number)
	{
		// base cases
		if (number==0)
			return 0;
		else if (number==1)
			return 1;

		// else make the problem smaller
		else
			return fib(number-1) + fib(number-2);
	}
}