package classExample;

public class ClassExample
{
	public static void main(String[] args)
	{
		String[] people = {"John", "Peter"};
		
		Person john = new Person(people[0]);
		Person peter = new Person(people[1]);
		
		john.greet();
		peter.greet();
		
		john.jump();
	}
}
