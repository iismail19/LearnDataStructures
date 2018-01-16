public class Reverser
{
	private String input;
	private String output;

	public Reverser(String in)
	{
		input = in;
	}

	public String doRev()
	{
		int stackSize = input.length(); // gets max size of the stack
		StackX theStack = new StackX(stackSize);

		for(int j = 0; j < stackSize; j++)
		{
			char ch = input.charAt(j); // get the character at that position in the String
			theStack.push(ch);
		}

		output = "";
		while(!theStack.isEmpty())
		{
			char ch = theStack.pop();
			output = output + ch;
		}
		return output;
	}
}