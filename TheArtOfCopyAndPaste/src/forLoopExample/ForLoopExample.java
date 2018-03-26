package forLoopExample;

public class ForLoopExample
{
	public static void main(String[] args)
	{
		String[] people = {"John", "Peter", "Henry"};
		
		for(int i = 0; i < people.length; i++)
		{
			System.out.println("Greetings " + i);
			System.out.println("Hello " + people[i] + ".");
			System.out.println("Have a nice day.");
			System.out.println();
		}
	}
}
