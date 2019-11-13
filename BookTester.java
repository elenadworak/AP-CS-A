

public class BookTester
{
    public static void main (String[] args) 
    {
        Book b1 = new Book ("Old Man and the Sea", "Ernest Hemingway", 345);
        System.out.println(b1.getTitle()); 
        b1.setTitle("Old Man");
        System.out.println(b1.getTitle()); 
        
    } 
}
