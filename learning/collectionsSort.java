// utilize the collections module to sort arrays

import java.util.*;

public class collectionsSort
{
	public static void main(String[] args)
	{
		String[] list = {"apples", "lemons", "bacon", "youtube"};
		List<String> newList = Arrays.asList(list);

		// sorts list alphbetically 
		Collections.sort(newList);
		System.out.printf("%s\n", newList);

		Collections.sort(newList, Collections.reverseOrder());
		System.out.printf("%s\n", newList);
	}
}