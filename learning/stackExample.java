import java.util.*;

// implementation of a stack with an ArrayList
class alStack<T>
{
	ArrayList<T> list = new ArrayList<T>();

	public void push(T x)
	{
		list.add(x);
	}

	public T pop()
	{
		T removed = list.get(list.size()-1);
		list.remove(list.size()-1);
		return removed;
	}

	public T peek()
	{
		return list.get(list.size()-1);
	}

	public boolean isEmpty()
	{
		return list.isEmpty();
	}

	public int size()
	{
		return list.size();
	}
}

// Implementation of a stack with a LinkedList
class llStack<T>
{
	LinkedList<T> list = new LinkedList<T>();

	public void push(T x)
	{
		list.add(x);
	}

	public T pop()
	{
		return list.pop();
	}

	public T peek()
	{
		return list.peek();
	}

	public boolean isEmpty()
	{
		return list.isEmpty();
	}

	public int size()
	{
		return list.size();
	}
}

public class stackExample
{
	public static void main(String[] args)
	{
		// testing alStack
		alStack<Integer> testStack1 = new alStack<Integer>();
		testStack1.push(3);
		testStack1.push(5);
		testStack1.push(7);		
		System.out.println(testStack1.pop());
		System.out.println(testStack1.peek());
		System.out.println(testStack1.isEmpty());
		System.out.println(testStack1.size());

		// testing llStack
		llStack<String> testStack2 = new llStack<String>();
		testStack2.push("This");
		testStack2.push("is");
		testStack2.push("fun");		
		System.out.println(testStack2.pop());
		System.out.println(testStack2.peek());
		System.out.println(testStack2.isEmpty());
		System.out.println(testStack2.size());				
	}
}