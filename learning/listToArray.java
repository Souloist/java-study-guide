import java.util.*;

public class listToArray
{
	public static void main(String[] args)
	{
		String[] stuff = {"pie", "corgi", "happy", "wheel"};
		
		// convert array to list
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(stuff));

		// do list things

		list.add("pumpkin");
		list.addFirst("firstthing");

		System.out.println(list);

		// convert back to an array

		stuff = list.toArray(new String[list.size()]);

		for (String s: stuff)
		{
			System.out.println(s);
		}

	}
}