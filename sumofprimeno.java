class Main
{
	static int sumOfEvenNums(int n) 
	{
	    return n * (n + 1);
	}
	static int sumOfOddNums(int n) 
	{ 
	    return n * n; 
	}
	public static void main(String[] args)
	{
		int n = 10;
		int evenSum = sumOfEvenNums(n);
		int oddSum = sumOfOddNums(n);
		System.out.println("Sum of First " + n + " Even numbers = " + evenSum);
		System.out.println("Sum of First " + n	+ " Odd numbers = " + oddSum);
	}
}

