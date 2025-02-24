abstract class BankAccount
{
    private static int accnum;
    private static float balance;
    static int intrestrate=5;
    double interest=0;
    static float y;
    static int x;
    BankAccount()
    {
        accnum=100123;
        balance=5000.0f;
        interest=balance*intrestrate;
       
    }
    abstract void calculateInterest();
   
    static void get_an()
    {
        x=accnum;
    }
    static void get_bl()
    {
        y=balance;
    }
}
class SavingsAccount extends BankAccount
{
    SavingsAccount()
    {
        super();
    }
    public void calculateInterest()
    {
        super.interest = super.intrestrate*super.y/365;
    }
    void display1()
    {
        System.out.println("Account Number : "+super.x);
        System.out.println("Balance : "+super.y);
        System.out.println("interest : "+interest);
    }
   
}

public class BankAcc
{
   
        public static void main(String[] args) {
          SavingsAccount a=new SavingsAccount();
          BankAccount.get_an();
          BankAccount.get_bl();
          a.calculateInterest();
          a.display1();

}

}

