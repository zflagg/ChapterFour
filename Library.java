
public class Library
{
   private Book[] books;
   private String name;
    public Library(int size, String nm)
    {
       this.books = new Book[size];
       this.name = nm;
    }
    public String toString() {
        String output = "The library has: \n";
        for (Book b : books) {
            output += b;
        }
        return output;
    }
    public void addBook(Book b, int i) {
        books[i] = b;
        i++;
    }
}
