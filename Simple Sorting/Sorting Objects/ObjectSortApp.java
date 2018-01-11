public class ObjectSortApp
{
	public static void main(String[] args)
	{
		int maxSize = 100;
		ArrayInOb arr;
		arr = new ArrayInOb(maxSize);

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

		System.out.println("Before sorting:");
		arr.display();

		arr.insertionSort();

		System.out.println("After sorting:");
		arr.display();

	}	
}