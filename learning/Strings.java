// Common string methods

public class Strings 
{
	public static void main(String[] args)
	{
		String[] words = {"corgi", "shibu", "pug", "poodle"};

		for (String word : words)
		{
			if (word.startsWith("p"))
			{
				System.out.println(word);
			}
		}
	}
}