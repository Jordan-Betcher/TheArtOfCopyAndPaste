package methodExample;

public class MethodExample
{
	public static void main(String[] args)
	{
		String[] people = {"John", "Peter"};
		
		greet(people[0]);
		greet(people[1]);
	}
	
	public static void greet(String name)
	{
		System.out.println("Hello " + name + ".");
		System.out.println("Have a nice day.");
		System.out.println();
	}
}
