abstract class Item 
{
    private String Title;
    private String Author;
    static int ItemCount = 0;
    Item(String Title, String Author) 
    {
        this.Title = Title;
        this.Author = Author;
        ItemCount++;
    }
    public String getTitle() 
    {
        return Title;
    }

    public String getAuthor()
     {
        return Author;
    }
    abstract void display();
}
class Book extends Item 
{
    private String Genre;
    Book(String Title, String Author, String Genre) 
    {
        super(Title, Author);
        this.Genre = Genre;
    }
    public String getGenre() 
    {
        return Genre;
    }
    public void display() 
    {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getGenre());
    }
}
class BorrowedBook extends Book 
{
    private String BorrowerName;
    private String DueDate;
    BorrowedBook(String Title, String Author, String Genre, String BorrowerName, String DueDate) 
    {
        super(Title, Author, Genre);
        this.BorrowerName = BorrowerName;
        this.DueDate = DueDate;
    }
    public String getBorrowerName() 
    {
        return BorrowerName;
    }
    public String getDueDate() 
    {
        return DueDate;
    }
    public void display() 
    {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getGenre());
        System.out.println("Borrower Name: " + BorrowerName);
        System.out.println("Due Date: " + DueDate);
        System.out.println("Total No. Of Items: " + ItemCount);
    }
}
public class ItemDetails 
{
    public static void main(String[] args) 
    {
        BorrowedBook obj = new BorrowedBook("The Tempest", "William Shakespeare", "Love", "Sri", "22 Nov");
        obj.display();
    }
}
