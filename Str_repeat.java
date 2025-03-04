import java.util.Scanner;

public class Str_repeat
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String a = in.nextLine();
		StringBuilder b  = new StringBuilder();
		for (int i = 0; i < a.length(); i++)
		{
			char curchar = a.charAt(i);
			if (Character.isDigit(curchar))
			{
				int rep = Character.getNumericValue(curchar);
				for (int j = 0; j < rep - 1; j++)
				{
					b.append(b.charAt(b.length() - 1));
				}
			}
			else
			{
				b.append(curchar);
			}
		}
		System.out.println("Output is " + b.toString());
	}
}
