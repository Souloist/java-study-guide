public class maxValue 
{
	public static void main(String[] args)
	{
		int[] array = {2, 4, 6, 10, 2, 20};
		System.out.println(maxValue(array));
	}

	public static int maxValue(int[] s)
	{
		int max = 0;
		for(int i=0; i<=s.length; i++)
		{
			if (s[i] > max)
				max = s[i];
		}

		return max;
	}
}