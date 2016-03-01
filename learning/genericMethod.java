// generic methods allow a method to take inputs of any datatype
public class genericMethod
{
	public static void main(String[] args)
	{
		Integer[] iList = {2, 4, 5, 6, 7};
		Character[] cList = {'a', 'c', 's', 'd', 'e'};

		printMe(iList);
		printMe(cList);
	}

	public static <T> void printMe(T[] x)
	{
		for (T thing : x)
		{
			System.out.printf("%s ", thing);
		}
		System.out.println();
	}
}