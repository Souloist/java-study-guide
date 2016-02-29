import java.util.*;

public class linkedList 
{
	public static void main(String[] args)
	{
		String[] things = {"apples", "corgis", "exams", "grades", "bacon"};
		List<String> list1 = new LinkedList<String>();

		for (String thing : things)
		{
			list1.add(thing);
		}

		String[] things1 = {"happy", "sad", "PI", "experiment"};

		List<String> list2 = new LinkedList<String>();

		for (String thing : things1)
		{
			list2.add(thing);
		}

		list1.addAll(list2);

		printMe(list1);
		removeStuff(list1, 2,5);
		printMe(list1);


	}

	private static void printMe(List<String> list)
	{
		for (String element: list)
		{
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	private static void removeStuff(List<String> list, int from, int to)
	{
		list.subList(from,to).clear();
	}

	private static void reverseMe(List<String> list)
	{
		ListIterator<String> it = list.listIterator(list.size());
		while(it.hasPrevious())
		{
			System.out.printf("$s ", it.previous());
		}
		System.out.println();
	}
}