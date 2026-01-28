package POO.Ex10;

public class Book {
    private String title;
    private String author;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showDetails(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
    }
}
