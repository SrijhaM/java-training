class Calc_fac_fibo
{
    static int Factorial(int n)
    {
       int a = 1,i;
        for(i = 2; i <= n; i++)
            a *= i;
            return a;
    }
    static void Fibonacci (int f)
    {
        int num1 = 0, num2 = 1;
        for(int i= 1; i <= f; i++)
        {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String args[])
    {
    int n = 5;
    System.out.println("Factorial value of " +n+ " is " +Factorial(5));
    int f = 5;
    System.out.print("Fibonnaci Series is: ");
    Fibonacci(f);
}
}