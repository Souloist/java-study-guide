// Using the data structures in collections

import java.util.*; // for the *, include all functions in the library

public class collections{
	public static void main(String[] args)
	{
		String[] list = {"eggs", "pancake", "pie", "bread"};
		List<String> foodlist = new ArrayList<String>();

		// adding array items to list
		for(String food : list)
		{
			foodlist.add(food);
		}

		System.out.println(foodlist);
	}
}