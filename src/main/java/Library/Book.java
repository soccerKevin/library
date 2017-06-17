package Library;

public class Book extends Borrowable implements Authorable{
    private String author;

    public Book(String title, String author){
        super(title);
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }
}