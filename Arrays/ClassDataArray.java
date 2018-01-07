public class ClassDataArray
{
	private Person a[];
	private int nElems;

	public ClassDataArray(int max) // constructor
	{
		a = new Person[max]; // create an array of type Person
		nElems = 0;
	}

	public Person find(String searchName)
	{
		int j;
		for(j = 0; j < nElems; j++)
			if(a[j].getLast().equals(searchName)) // found item?
				break; // exit the loop once found
		if(j == nElems) // not in array
			return null;
		else
			return a[j];
	}

	// put Person into an Array
	public void insert(String last, String first, int age)
	{
		a[nElems] = new Person(last, first, age);
		nElems++; // increament
	}

	public boolean delete(String searchName)
	{
		int j;
		for(j = 0; j < nElems; j++)
			if(a[j].getLast().equals(searchName))
				break;
		if(j == nElems) // not found
			return false;
		else // found it, now delete it, and shift array accordingly
		{
			for(int k = j; k > j; k++) // shift down the array
				a[k] = a[k+1];
			nElems--; // decreament
			return true;
		}
	}

	public void displayA()
	{
		for(int j = 0; j < nElems; j++)
			a[j].displayPerson();
	}

}