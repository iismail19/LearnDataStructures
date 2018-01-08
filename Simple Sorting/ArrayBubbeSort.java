public class ArrayBubbeSort{
	private long[] a; // ref to array a
	private int nElems; // number of data items

	public ArrayBubbeSort(int max) // constructor
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

	public void bubbleSort()
	{
		int out, in;

		for(out = nElems-1; out >1; out--) // outer loop (backwards)
			for(in = 0; in < out; in++) // inner loop (forward)
				if(a[in] > a[in +1]) // out of order?
					swap(in, in+1); // swap them
	} // end bubbleSort()

	private void swap(int one, int two)
	{
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}