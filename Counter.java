import java.util.Scanner;
class Counter
{
    static int count = 0;
    Counter()
    {
        count++;
    }
    void display()
    {
    System.out.println("Object created! Current Object:" +count);
    }
    public static void main(String args[])
    {
        Counter a = new Counter();
        a.display();
        Counter b = new Counter();
        b.display();
        Counter c = new Counter();
        c.display();
    }
}