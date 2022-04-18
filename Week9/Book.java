public class Book {
    // Example 1
    String title;
    String author;
    int numberOfPages;

    // Example 2
    String title;
    String author;
    int numberOfPages;
    Book(String tit,String aut,int num) {
    title = tit;
    author = aut;
    numberOfPages = num;
    }
    public String getInitials() {
        return null;
    }
    public void setOwner(String string) {
    }
    public String getOwner() {
        return null;
    }
}

// Example 2

class Book {
    String title;
    String author;
    int numberOfPages;
    Book(String tit,String aut,int num) {
    title = tit;
    author = aut;
    numberOfPages = num;
    }
}