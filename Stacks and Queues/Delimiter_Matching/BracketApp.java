import java.util.Scanner;
public class BracketApp
{
	public static void main(String[] args) {
		String input;
		while(true)
		{
			System.out.println("Enter string containing delimiters");
			System.out.flush();
			input = getString();
			if(input.equals("")) // quit if [Enter]
				break;

			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check();
		}
	}

	public static String getString()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
}