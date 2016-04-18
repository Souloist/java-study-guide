public class learning
{


	public static void main(String[] args)
	{
		System.out.println("Hello World");
		Person richard = new Person("richard");
		richard.writeName();
	}
}
class Person
{
	private String name;

	public Person()
	{
		System.out.println("Constructor running!");
	}

	public Person(String name)
	{
		this.name = name;
	}

	public void writeName()
	{
		System.out.println("Your name is " + this.name);
	}
}