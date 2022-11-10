public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static Book of(String title, String author) {
        return new Book(title, author);
    }

    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + '}';
    }
}