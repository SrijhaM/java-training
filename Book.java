class Book
{
    String Booktitle;
    float Bookprice;
    Book()
    {
        Booktitle = "Java Programming";
        Bookprice = 100.0f;
    }
    void display()
    {
        System.out.println("Book Title :" +Booktitle);
        System.out.print("Book Price :" +Bookprice);
    }
 public static void main (String args[])
{
    Book b = new Book();
    b.display();
}
}