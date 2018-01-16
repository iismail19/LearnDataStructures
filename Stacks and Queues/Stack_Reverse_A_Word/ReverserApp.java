import java.util.Scanner;
public class ReverserApp
{
	public static void main(String[] args)
	{
		String input, output;
		while (true)
		{
			System.out.print("Enter a String: ");
			System.out.flush(); // read a string from keyboard
			input = getString();
			if(input.equals("")) // quit if [Enter]
				break;

			Reverser theReverser = new Reverser(input);
			output = theReverser.doRev(); // reverse the String
			System.out.println("Reversed: " + output);
		}
	}

	public static String getString()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
}