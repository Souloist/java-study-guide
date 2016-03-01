import java.util.*;

public class genericReturn
{
	public static void main(String[] args)
	{
		System.out.println(max(2,3,4));
		System.out.println(max('2', '3', '4'));
	}


	public static <T extends Comparable<T>> T max(T a, T b, T c)
	{
		T max = a;

		// compareTo returns -1(less), 0(equal) or 1(greater).
		if(b.compareTo(a) > 0)
			max = b;

		if(c.compareTo(max) > 0)
			max = c;

		return max;
	}
}