import java.util.Scanner;
class ATM {
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int bal = 500000;
        int p = 2225;
        System.out.println("Welcome to Great Girigalan Bank");
        System.out.println("Please insert your ATM card");
        System.out.print("Enter your PIN: ");
        int enteredpin = in.nextInt();
        if (enteredpin == p) 
        {
            System.out.println("Login successful!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            int choice = in.nextInt();

            if (choice == 1) 
            {
                System.out.println("Your Balance is: ₹" + bal);
            } 
            else if (choice == 2) 
            {
                System.out.print("Enter amount to withdraw: ");
                int amt = in.nextInt();
                if (amt > bal) 
                {
                    System.out.println("Insufficient balance.");
                } 
                else 
                {
                    bal = bal - amt;
                    System.out.println("₹" + amt + " withdrawn successfully.");
                    System.out.println("Remaining Balance: ₹" + bal);
                }
            } 
            else if (choice == 3) 
            {
                System.out.print("Enter amount to deposit: ");
                int amt = in.nextInt();
                bal = bal + amt;
                System.out.println("₹" + amt + " deposited successfully.");
                System.out.println("Updated Balance: ₹" + bal);
            } 
            else if (choice == 4) 
            {
                System.out.println("Thank you! Visit Again.");
            } 
            else 
            {
                System.out.println("Invalid option.");
            }
        } 
        else 
        {
            System.out.println("Incorrect PIN. Access Denied.");
        }
    }
}
