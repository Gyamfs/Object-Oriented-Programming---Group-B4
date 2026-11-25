package library.model;

public class Textbook extends Book {
    public static final int LOAN_DAYS = 14;

    public Textbook(String bookId, String title, String author) {
        super(bookId, title, author);
    }

    @Override public int getLoanPeriodDays(){ 
        return LOAN_DAYS; 
    }
    @Override public String getCategory(){ 
        return "Textbook"; 
    }

    
}

