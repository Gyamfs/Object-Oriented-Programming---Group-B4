public class Book {
    private String bookId, title, author;
    private boolean available = true;
    public Book(String bookId, String title, String author) {
        this.bookId = bookId; this.title = title; this.author = author;
    }
    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
    public int getLoanPeriodDays() { return 7; }
    public boolean canBeBorrowedBy(Member member) { return member != null && available; }
    public String toString() { return bookId + " - " + title + " (" + (available ? "Available" : "Unavailable") + ")"; }
}
