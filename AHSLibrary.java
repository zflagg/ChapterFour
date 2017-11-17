

public class AHSLibrary
{
    
    public static void main()
    {
        Library ahs = new Library(2, "Acalanes");
        Author jim = new Author("Jim", 36);
        Book jimmy = new Book(jim, "Jimmy's Adventures");
        ahs.addBook(jimmy, 0);
        Author john = new Author("John", 42);
        Book johnny = new Book(john, "Johnny's Adventures");
        ahs.addBook(johnny, 1);
        System.out.println(ahs);
    }

}
