package classExample;

public class Person
{
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public void greet()
	{
		System.out.println("Hello " + name + ".");
		System.out.println("Have a nice day.");
		System.out.println();
	}
	
	public void jump()
	{
		System.out.println(name + " jumps in the air");
		System.out.println();		
	}
}
