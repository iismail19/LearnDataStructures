public class ClassDataApp
{
	public static void main(String[] args)
	{
		int maxSize = 100;
		ClassDataArray arr;
		arr = new ClassDataArray(maxSize);

		// insert 10 items

		arr.insert("Evans", "Patty", 24);
		arr.insert("Smith", "Lorraine", 37);
		arr.insert("Yee", "Tom", 43);
		arr.insert("Adams", "Henry", 63);
		arr.insert("Hashimoto", "Sato", 21);
		arr.insert("Stimson", "Henry", 29);
		arr.insert("Velasquez", "Jose", 72);
		arr.insert("Lamarque", "Henry", 54);
		arr.insert("Vang", "Minh", 22);
		arr.insert("Cresewll", "Lucinda", 18);

		arr.displayA();

		String searchKey = "Stimson"; // search for item

		Person found;

		found = arr.find(searchKey);

		if(found != null)
		{
			System.out.println("Found ");
			arr.displayA();
		}
		else
			System.out.println("Can't find " + searchKey);
		
		System.out.println("Deleting Smith, Yee, and Cresewll");
		arr.delete("Smith");
		arr.delete("Yee");
		arr.delete("Cresewll");

		arr.displayA();

	}	
}