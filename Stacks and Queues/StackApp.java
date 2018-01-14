public class StackApp
{
	public static void main(String[] args) {
		StackX theStack = new StackX(10); // make the stack

		theStack.push(20); // push to stack
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);

		while(!theStack.isEmpty()) // until it is empty
		{
			// delete items from the stack
			long value = theStack.pop();
			System.out.print(value + " ");
		}
		System.out.println("");
	}
}