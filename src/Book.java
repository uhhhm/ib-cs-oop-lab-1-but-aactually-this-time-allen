public class Book extends ReadingItem {
    private String isbn;
    private String edition;
    private String title;

    public Book(String name, String location, int price, String description, int wordCount, String datePublished, String author, String isbn, String edition, String title) {
        super(name, location, price, description, wordCount, datePublished, author);
        this.isbn = isbn;
        this.edition = edition;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", ISBN: " + isbn + ", " + super.toString();
    }
}