/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
  public String getAuthor() {
    return author;
  }
  public int getRating() {
    return rating;
  }
  public String toString() 
  {
    String info = "\"" + title + "\", was written by " + author;
    if (rating != 0) 
    { 
      info += ", its rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setRating(int r) {
    if (r<=10 && r>=1){
          rating = r;
    }
  }
  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }
}
