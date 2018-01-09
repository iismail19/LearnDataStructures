public class ArraySelectionSort
{
	private long[] a;
	private int nElems;

	public ArraySelectionSort(int max)
	{
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value)
	{
		a[nElems] = value;
		nElems++;
	}

	public void display()
	{
		for(int j = 0; j < nElems; j++)
			System.out.print(a[j] + " ");
		System.out.println("");
	}

	public void selectionSort()
	{
		int out, in, min;

		for(out = 0; out < nElems; out++) // outer loop
		{
			min = out; // minimum
			for(in = out +1; in < out; in++) // inner loop
				if(a[in] < a[min]) // if min greater,
					min = in;	// we have a new min
			swap(out, min);
		} // end of for loop
	} // end of selection sort()

	public void swap(int one, int two)
	{
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

}