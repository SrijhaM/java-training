class dimondpattern
	{
	public static void main(String[] args)
	{
		int num = 4;
		int m = 1;
		int n;
		while (m <= num) 
		{
			n = 1;
			while (n++ <= num - m) 
			{
				System.out.print(" ");
			}
			n = 1;
			while (n++ <= m * 2 - 1)
				{
				System.out.print("*");
			}
			System.out.println();
			m++;
		}
		m = num - 1;
		while (m > 0)
			{
			n = 1;
			while (n++ <= num - m)
				{
				System.out.print(" ");
			}
			n = 1;
			while (n++ <= m * 2 - 1) 
			{
				System.out.print("*");
			}
			System.out.println();
			m--;
		}
	}
}

