public class StackX
{
	private int maxSize;
	private long[] stackArray;
	private int top;

	public StackX(int max)
	{
		maxSize = max;
		stackArray = new long[max];
		top = -1;
	}

	public void push(long value)
	{
		stackArray[++top] = value;
	}

	public long pop()
	{
		return stackArray[top--]; // return the current top value then decrement
	}

	public long peek() // gives you the value of the current top of the stack
	{
		return stackArray[top];
	}

	public boolean isEmpty() // true if the stack is empty
	{
		return (top == -1);
	}

	public boolean isFull() // true if the stack is full
	{
		return (top == maxSize-1);
	}



}