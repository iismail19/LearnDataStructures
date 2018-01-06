public class OrdArray
{
	private long[] a; // ref to array a
	private int nElems; // number of data items

	public OrdArray(int max) // constructor
	{
		a = new long[max]; // create array
		nElems = 0;
	}

	public int size()
	{ return nElems; }

	public int find(long searchKey) // using Binary Search
	{
		int lowerBound = 0;
		int upperBound = nElems - 1;

		int curIn; 
		while(true)
		{
			curIn = (lowerBound + upperBound) / 2;
			if(a[curIn] == searchKey)
				return curIn;
			else if(lowerBound > upperBound)
				return nElems;
			else
			{
				if(a[curIn] < searchKey)
					lowerBound = curIn + 1; // it's in the upperBound
				else
					upperBound = curIn - 1; // it's in the lowerBound
			} // end of else
		} // end of while
	} // end of find()

	public void insert(long value)
	{
		int j;
		for(j = 0; j < nElems; j++) // find it
			if(a[j] > value) // (Linear Search)
				break;
		for(int k = nElems; k > j; k--)
			a[k] = a[k-1]; // move up array to make room for new value
		a[j] = value; // insert the value
		nElems++;  // increament the number of elements
	}

	public boolean delete(long value)
	{
		int j = find(value); // find returns the index at which the vlaue exists
		if(j == nElems) // can't find it
			return false;
		else
		{
			for(int k = j; k < nElems; k++)
				a[k] = a[k+1];
			nElems--;
			return true;
		}
	}

	public void display()
	{
		for(int j = 0; j < nElems; j++)
			System.out.print(a[j] + " ");
		System.out.println("");
	}



}