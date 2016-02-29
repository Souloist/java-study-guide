public class fizzbuzz
{
	public static void main(String[] args)
	{
		fizzbuzz(100);
	}

	private static void fizzbuzz(int range)
	{
		for (int i = 1; i <= range; i++)
		{
			if (i % 15 == 0)
				System.out.println("fizzbuzz");
			else if (i % 5 == 0)
				System.out.println("fizz");
			else if (i % 3 == 0)
				System.out.println("buzz");
			else 
				System.out.println(i);
		}
	}
}