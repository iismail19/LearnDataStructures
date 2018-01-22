public class BracketChecker
{
	private String input;

	public BracketChecker(String in) // constructor
	{
		input = in;
	}

	public void check()
	{
		int stackSize = input.length(); // get the max stack size
		StackX theStack = new StackX(stackSize); // making an instance of my StackX class

		for(int j = 0; j < input.length(); j++)
		{
			char ch = input.charAt(j); // get each character
			switch(ch)
			{
				case '{': // opening Symbol, either character gets pushed
				case '[': // since they have no case they default to the last case
				case '(':
					theStack.push(ch); // push them
					break;

				case '}': // closing Symbol
				case ']':
				case ')':
					if(!theStack.isEmpty()) // if the stack is not empty
					{
						char chx = theStack.pop(); // pop and check
						if((ch == '}' && chx != '{') ||
							(ch == ']' && chx != '[') ||
							(ch == ')' && chx != '('))
							System.out.println("Error: " + ch + " at " + j);
					}
					else
						System.out.println("Error: " + ch + " at " + j); // prematurely empty
					break;
				default: // no action on other characters
					break;
			} // end switch
		} // end for
		// all characters have been processed
		if(!theStack.isEmpty())
			System.out.println("Error: missing right delimiter");
	} // end check()

}