package library.model;

public abstract class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean available = true;

    public Book(String bookId, String title, String author) {
        if (bookId == null || bookId.isBlank()) {
            throw new IllegalArgumentException("Book ID cannot be null or blank.");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Book title cannot be null or blank.");
        }
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Book author cannot be null or blank.");
        }

        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getBookId(){ 
        return bookId; 
    }
    public String getTitle(){ 
        return title; 
    }
    public String getAuthor(){ 
        return author; 
    }
    public boolean isAvailable(){
        return available; 
    }
    public void setAvailable(boolean available){ 
        this.available = available; 
    }

    public abstract int getLoanPeriodDays();

    public abstract String getCategory();

    public boolean canBeBorrowedBy(Member member){ 
        return member != null && available && member.canBorrow(); 
    }

    public String toString(){ 
        return bookId + " - " + title + " (" + (available ? "Available" : "Unavailable") + ")"; 
    }

    public boolean matches(String query) {
        if (query == null || query.isBlank()) return true;
        String q = query.toLowerCase().trim();
        return bookId.toLowerCase().contains(q)
                || title.toLowerCase().contains(q)
                || author.toLowerCase().contains(q);
    }
}
