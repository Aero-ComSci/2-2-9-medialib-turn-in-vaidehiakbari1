public class Song {
  
  private String title;
  private int rating;
  public Song(String t)
  {
    title = t;
    rating = 0;
  }
  
  public String getTitle() {
    return title;
  }
  public int getRating() {
    return rating;
  }
  public String toString() 
  {
    String info = "\"" + title + "\", has rating: " + rating;
    if (rating != 0) 
    { 
      info += ", its rating is " + rating;
    }
    return info;
  }
  
  public void adjustRating(int r){
    if (r <= 10 && r >= 1){
      rating = r;
    }
  }
  
  public void setTitle(String t) {
    title = t;
  }
  
  public boolean equals(Song s){
    if (this.title.equals(s.title) && this.rating == s.rating) {
        return true;
    } else {
        return false;
    }
  }
}
