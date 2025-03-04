import java.util.Scanner;
class Rev_words
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Sentence: ");
		String input = in.nextLine();
		input = input.replaceAll("\\s+", " ").trim();
		String[] words = input.split(" ");
		StringBuilder revsen = new StringBuilder();
		for(int i = words.length - 1; i >= 0; i--)
		{
			revsen.append(words[i]).append(" ");
		}
		System.out.println("Reversed Sentence: " +revsen.toString().trim());
	}
}
