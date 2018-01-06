public class Person
{
	private String lastName;
	private String firstName;
	private int age;

	public Person(String last, String first, int a) // constructor
	{
		lastName = last;
		firstName = first; 
		age = a;
	}

	public void displayPerson()
	{
		System.out.println("	Last name: " + lastName);
		System.out.println(", First name: " + firstName);
		System.out.println(", Age: " + age);
	}

	public String getLast() // returns the Last name of a Person
	{
		return lastName;
	}

} // end of the Person Class