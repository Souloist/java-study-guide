import java.util.*;

public class hashSet
{
	public static void main(String[] args)
	{
		String[] phrase = {"Time", "to", "du", "du", "du", "duel"};

		List<String> list = Arrays.asList(phrase);

		System.out.println(list);

		Set<String> set = new HashSet<String>(list);

		// you can convert a list to a set in order to get only unique values
		// However, order of the original list will not be preserved
		System.out.println(set);

		// if you want to maintain the original order, you can use a linkedhashset
		Set<String> orderedSet = new LinkedHashSet<String>(list);
		System.out.println(orderedSet);
	}
}