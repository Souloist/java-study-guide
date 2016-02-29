import java.util.*;

public class union 
{
	public static void main(String[] args)
	{
		List<Integer> first = new ArrayList<Integer>();
		List<Integer> second = new ArrayList<Integer>();

		first.addAll(Arrays.asList(1,2,3,4,5));
		second.addAll(Arrays.asList(3,4,5,6,7));
		System.out.println(union(first,second));
	}

	public static List<Integer> union(Collection<Integer> p1, Collection<Integer> p2)
	{
		List<Integer> newList = (List<Integer>) p1;

		// iterator to iterate through p2
		Iterator<Integer> it = p2.iterator();
		while (it.hasNext())
		{
			int next = it.next();
			if (!(p1.contains(next)))
				newList.add(next);
		}

		return newList;
	}
}