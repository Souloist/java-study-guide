import java.util.*;

public class collectionsReverse
{
	public static void main(String[] args)
	{
		// create an array and convert to list
		Character[] chars = {'p', 's', 'w', 'q'};

		List<Character> charList = Arrays.asList(chars);

		System.out.println("List is : ");
		output(list)

		// reverse and print out the list
		Collections.reverse(list);

		System.out.println("List is : ");
		output(list);

		// create new array and a new list
		Character[] new_charList = new Character[4];
		List<Character> listCopy = Arrays.asList(new_charList);

		// copy contexts of charList to listCopy
		Collections.copy(listCopy, charList);


	}

	private static void output(List<Character> list)
	{
		for (Character c : list)
			System.out.println(c);
	}
}