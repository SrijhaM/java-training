import java.util.Scanner;
class Bookdetails
{
    String title;
    String author;
    float price;
    Bookdetails(String title,String author,float price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display()
    {
        System.out.println("Title: " +title);
        System.out.println("Author: " +author);
        System.out.println("Price: " +price);
    }
    public static void main(String args[])
    {
        Bookdetails a = new Bookdetails("Tempest","Shakesphere",2500.00f);
        a.display();
    }
}