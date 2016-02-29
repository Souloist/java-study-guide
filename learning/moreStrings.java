// String methods continued 

public class moreStrings
{
	public static void main(String[] args)
	{
		String name = "richardrocks";
		String otherName = "happywheels";
		// Search for 'r' starting at the 6th index
		// If none is found, it returns -1
		System.out.println(name.indexOf('r', 6)); //returns 7

		// You can also concatinate strings

		System.out.println(name.concat(otherName));
		// System.out.println(name+otherName);

		// You can replace parts of strings
		System.out.println(name.replace("richard", "eric"));

		// You can make strings uppercase or lowercase
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		// You can remove extra white space in a string

		String tooLong = "     RIchard     ";
		System.out.println(tooLong.trim());
	}
}