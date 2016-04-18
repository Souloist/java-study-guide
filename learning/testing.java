import java.util.*;

public class testing
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("3");
		list.add("Richard");

		printMe(list);
	}

	public static <T> void printMe(List<T> list)
	{
		for (T i : list)
		{
			System.out.println(i);
		}
	}
}