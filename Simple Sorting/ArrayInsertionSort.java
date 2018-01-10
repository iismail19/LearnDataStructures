public class ArrayInsertionSort{
	private long[] a; // ref to array a
	private int nElems; // number of data items

	public ArrayInsertionSort(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}

	public void insert(long value)
	{
		a[nElems] = value;
		nElems++;
	}

	public void display() // displays array contents
	{
		for(int j = 0; j < nElems; j++)
			System.out.print(a[j] + " ");
		System.out.println("");
	}

	public void insertionSort()
	{
		int in, out;

		for(out =1 ; out< nElems; out++)
		{
			long temp = a[out];
			in = out;
			while(in >0 && a[in-1] >= temp)
			{
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}

}