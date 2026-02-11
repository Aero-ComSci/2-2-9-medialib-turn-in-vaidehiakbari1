public class MediaLib
{
  private Book book;
  private static String owner = "Mr Baez";
  public static String getOwner() {
    return owner;
  }
  private Movie movie;

  private static int numberOfitems;

  public static int getNumberOfItems() {
    return numberOfitems;
  } 

  public void addBook(Book b)
  {
    book = b;
    numberOfitems++;
  }
  public void addMovie(Movie m)
  {
    movie = m;
  }
  public String toString() 
  {

    String info = "This book was added: " + book;
    info += "\nThis movie was added: " + movie;
    info += "\nNumber of items in the library: " + numberOfitems;    
    return info;
  }

  public Book getBook() {
    return book;
  }
  public void testBook(Book tester) {
    tester.setTitle("Una NUEVA Title");
    System.out.println("The updated book title is: " + tester.getTitle());
  }

}
